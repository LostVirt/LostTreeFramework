package behaviour.example;

import framework.Leaf;
import org.lostclient.api.accessors.Players;
import org.lostclient.api.utilities.MethodProvider;
import org.lostclient.api.utilities.ReactionGenerator;

/**
 * @author LostVirt
 * @created 29/11/2021 - 11:09
 * @project LostTreeFramework
 */
public class ExampleLeaf1 extends Leaf
{
	@Override
	public boolean isValid()
	{
		return Players.localPlayer().isInCombat();
	}

	@Override
	public int onLoop()
	{
		MethodProvider.log("Sleep while in combat");
		return ReactionGenerator.getNormal();
	}
}
