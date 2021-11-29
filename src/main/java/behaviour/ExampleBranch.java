package behaviour;

import framework.Branch;

/**
 * @author LostVirt
 * @created 29/11/2021 - 11:05
 * @project LostTreeFramework
 */
public class ExampleBranch extends Branch
{
	@Override
	public boolean isValid()
	{
		// Validation for if this branch should be executed
		return true;
	}
}
