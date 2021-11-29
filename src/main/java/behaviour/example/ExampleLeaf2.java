package behaviour.example;

import framework.Leaf;
import org.lostclient.api.accessors.NPCs;
import org.lostclient.api.events.EntityInteractEvent;
import org.lostclient.api.utilities.MethodProvider;
import org.lostclient.api.utilities.ReactionGenerator;

/**
 * @author LostVirt
 * @created 29/11/2021 - 11:11
 * @project LostTreeFramework
 */
public class ExampleLeaf2 extends Leaf
{
	@Override
	public boolean isValid()
	{
		return true;
	}

	@Override
	public int onLoop()
	{
		MethodProvider.log("Attacking Rat");
		new EntityInteractEvent(NPCs.closest("Rat"), "Attack").execute();
		return ReactionGenerator.getNormal();
	}
}
