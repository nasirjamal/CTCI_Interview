package Chapter4;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class BSTTree {

	BSTNode root;
	ArrayList<Integer> aL1= new ArrayList<Integer>();


	public BSTTree()
	{
		root=null;
	}

	public void insert(BSTNode data)
	{
		BSTNode R= root;
		if (R==null)
		{
			root=data;
		}
		else
		{
			while(R!=null)
			{
				if(data.data>R.data)
				{
					if (R.right==null)
					{
						R.right=data;
						break;
					}
					else
					{
						R=R.right;
					}
				}
				else if(data.data<R.data || R.data == data.data)
				{
					if (R.left==null)
					{
						R.left=data;
						break;
					}
					else
					{
						R=R.left;
					}
				}
			}
		}
	}


	public void preOrder(BSTNode node)
	{
		if(node != null)
		{
			System.out.println(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	public void inOrder(BSTNode node)
	{
		if(node != null)
		{
			inOrder(node.left);
			System.out.println(node.data);
			inOrder(node.right);
		}
	}

	public ArrayList<Integer> inOrderCheckBST(BSTNode node)
	{
		if(node != null)
		{
			inOrderCheckBST(node.left);
			//System.out.println(node.data);
			aL1.add(node.data);
			inOrderCheckBST(node.right);
		}
		return aL1;

	}


	public void insertCheckBST(BSTTree tree,int a[], int left, int right)
	{

		if (left>=right)
		{
			//System.out.println("End reached..");
			return;
		}	
		int mid = (left+right)/2;
		BSTNode N1 = new BSTNode(a[mid]);

		tree.insert(N1);
		//System.out.println(" "+a[mid]);

		insertCheckBST(tree, a,left, mid);
		insertCheckBST(tree, a,mid+1, right);

	}


	public void postOrder(BSTNode node)
	{
		if(node != null)
		{
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.data);
		}
	}

	public boolean search(int data)
	{
		BSTNode R= root;
		while(R!=null)
		{
			if (data==R.data)
			{
				return true;
			}
			else
			{
				if(data>R.data)
				{
					if (R.right==null)
					{
						return false;			
					}
					else
					{
						R=R.right;
					}
				}
				else if(data<R.data)
				{
					if (R.left==null)
					{
						return false;
					}
					else
					{
						R=R.left;
					}
				}
			}
		}
		return false;
	}


	public boolean rec_search(BSTNode R, int data)
	{
		//BSTNode R= root;

		if (R!=null)
		{
			if (R.data == data)
			{
				return true;
			}
			else if (R.data> data)

			{
				return rec_search(R.left, data);
			}
			else if (R.data< data) 

			{
				return rec_search(R.right, data);
			}
		}
		return false;
	}


	public BSTNode del(BSTNode R, int data)
	{
		if (R!=null)
		{
			if(data<R.data)
			{	
				R.left=	del(R.left, data);
			}

			else if (data > R.data)
			{
				R.right=del(R.right, data);

			}

			else if (data == R.data)
			{
				if (R.left==null && R.right == null)
				{
					System.out.println("Both null!");	
					R=null;
				}

				else if (R.left==null || R.right == null)
				{
					if(R.left==null)
					{
						R=R.right;
					}
					else if (R.right==null)
					{
						R=R.left;
					}
				}
				else
				{
					BSTNode max= R.left;
					while(max.right!=null)
					{
						max=max.right;
					}
					R.data=max.data;
					max=null;	
					R.left=del(R.left, R.data);

				}
			}
		}
		return R;
	}


	public boolean checkBST(BSTNode R)
	{
		int p1, p2;
		inOrderCheckBST(R);
		System.out.println(aL1);
		int i=0;
		while (i<aL1.size()-1 )
		{
			p1=aL1.get(i);
			p2=aL1.get(i+1);
			if (p1<p2)
			{
				i++;
				p1++;
				p2++;
			}
			else
			{
				return false;
			}
		}
		return true;
	}

	public void levelOrder()
	{
		BSTNode temp=root;
		Queue<BSTNode> q = new LinkedList<BSTNode>();
		while (temp!=null)
		{
			System.out.println(temp.data);
			if(temp.left!=null)
			{
				q.add(temp.left);
			}
			if (temp.right!=null)
			{
				q.add(temp.right);
			}
			if (q.size()>0)
			{
				temp=q.remove();
			}
			else
			{
				break;
			}
		}
	}

	public void BSTSeq()
	{
		BSTNode temp=root;
		Queue<BSTNode> q1 = new LinkedList<BSTNode>();
		Queue<BSTNode> q2 = new LinkedList<BSTNode>();
		q1.add(temp);
		while (!q1.isEmpty()||!q2.isEmpty())
		{
			while (!q1.isEmpty())
			{
				temp=q1.remove();
				if(temp.left!=null)
				{
					q2.add(temp.left);
				}
				if (temp.right!=null)
				{
					q2.add(temp.right);
				}
				System.out.print(temp.data);
			}
			System.out.println(" ");

			while (!q2.isEmpty())
			{
				temp=q2.remove();
				if(temp.left!=null)
				{
					q1.add(temp.left);
				}
				if (temp.right!=null)
				{
					q1.add(temp.right);
				}
				System.out.print(temp.data);
			}
			System.out.println(" ");
		}
	}

}
