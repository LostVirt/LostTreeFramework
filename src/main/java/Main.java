import behaviour.ExampleBranch;
import behaviour.example.ExampleLeaf1;
import behaviour.example.ExampleLeaf2;
import framework.Tree;
import org.lostclient.api.script.AbstractScript;
import org.lostclient.api.script.ScriptManifest;
import org.lostclient.api.utilities.MethodProvider;

/**
 * @author LostVirt
 * @created 29/11/2021 - 11:02
 * @project LostTreeFramework
 */

@ScriptManifest(name = "LostTreeFramework", author = "LostVirt", version = 1.0)
public class Main extends AbstractScript
{

	// initialise tree framework
	private final Tree tree = new Tree();

	@Override
	public void onStart(String[] strings)
	{
		MethodProvider.log("Starting script");
		tree.addBranches(
			new ExampleBranch().addLeafs(new ExampleLeaf1(), new ExampleLeaf2())
		);
	}

	@Override
	public void onExit()
	{
		MethodProvider.log("Stopping script");
	}

	@Override
	public void onPause()
	{
		MethodProvider.log("Pausing script");
	}

	@Override
	public void onResume()
	{
		MethodProvider.log("Resuming script");
	}

	@Override
	public int onLoop()
	{
		return 0;
	}
}
