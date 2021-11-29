package framework;

import org.lostclient.api.utilities.MethodProvider;
import org.lostclient.api.utilities.ReactionGenerator;
import util.API;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * @author LostVirt
 * @created 05/10/2021 - 21:54
 * @project LostBuyer
 */
public abstract class Branch extends Leaf
{

	public final List<Leaf> children;

	public Branch()
	{
		this.children = new LinkedList<>();
	}


	public Branch addLeafs(Leaf... leaves)
	{
		Collections.addAll(this.children, leaves);
		return this;
	}


	@Override
	public int onLoop()
	{
		return children.stream()
				.filter(c -> Objects.nonNull(c) && c.isValid())
				.findAny()
				.map(tLeaf ->
				{
					API.currentBranch = this.getClass().getSimpleName();
					API.currentLeaf = tLeaf.getClass().getSimpleName();
					return tLeaf.onLoop();
				}).orElseGet(ReactionGenerator::getPredictable);
	}
}
