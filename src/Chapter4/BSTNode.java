package Chapter4;

public class BSTNode {
public int data;
public BSTNode left, right;

public BSTNode ()
{
	left=null;
	right=null;
}

public BSTNode(int data)
	{
		this.data=data;
	}

public void setLeft(BSTNode left)
	{
		this.left=left;
	}

public void setRight(BSTNode right)
{
	this.left=right;
}

}
