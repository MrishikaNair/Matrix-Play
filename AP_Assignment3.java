import java.util.*;
interface create
{
	void createmat(int a, int b, int ID);
}
interface check
{
	int checkmat(int[][] mat, int ID);
}
interface operations
{
	int[][] transpose(int[][] mat, int a, int b);
	float [][] inverse(int mat[][], float [][]inverse, int a);
	void add(int [][] mat_a, int [][] mat_b);
	void sub(int[][] mat_a, int [][]mat_b);
	void mul(int [][]mat_a, int [][]mat_b);
	void div(int [][]mat_a, int [][]mat_b);
	void elewisemul(int [][]mat_a, int [][]mat_b);
	void elewisediv(int [][]mat_a, int [][]mat_b);
	void mean(int[][]mat);
	void sumtrans(int [][]mat);
	int singscal(int [][]mat,int [][]mat_a);
}
public class AP_Assignment3
{
	public static int ID=1;
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		int choice=0;
		int flag=0;
		Rect obj1=new Rect();
		Row obj2=new Row();
		Column obj3=new Column();
		Square obj4=new Square();
		Symmetric obj5=new Symmetric();
		Skew obj6=new Skew();
		Upper obj7=new Upper();
		Lower obj8=new Lower();
		Singular obj9=new Singular();
		Diagonal obj10=new Diagonal();
		Scalar obj11=new Scalar();
		Identity obj12=new Identity();
		Singleton obj13=new Singleton();
		Ones obj14=new Ones();
		nullmat obj15=new nullmat();
		Matrix obmain=new Matrix();
		while(choice<=15)
		{
			System.out.println("1. give a matrix input");
			System.out.println("2. create a matrix");
			System.out.println("3. change element of a matrix");
			System.out.println("4. display matrices of given type");
			System.out.println("5. perform additon, subtraction, multiplication, division");
			System.out.println("6. perform element wise operation");
			System.out.println("7. Transpose matrices");
			System.out.println("8. Inverse matrices");
			System.out.println("9. Compute means");
			System.out.println("10. Compute determinants");
			System.out.println("11. Use singleton matrices as scalars");
			System.out.println("12. Compute A+A(transpose)");
			System.out.println("13. Compute Eigen vectors and values.");
			System.out.println("14. Solve sets of linear equations");
			System.out.println("15. Retrieve all the existing matrices");
			System.out.println("16. Exit");
			choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Enter matrix dimension in the form axb where a is no. of rows and b is no. of columns");
				String dim=sc.next();
				int a=Integer.parseInt(dim.substring(0,1));
				int b=Integer.parseInt(dim.substring(2,3));
				int [][] mat=new int[a][b];
				System.out.println("Enter value row wise");
				for(int i=0;i<a;i++)
				{
					for(int j=0;j<b;j++)
					{
						mat[i][j]=sc.nextInt();
					}
				}
				if(a!=b)
				{
					flag= obj2.checkmat(mat, ID);
					if(flag==0)
						flag= obj3.checkmat(mat, ID);
					if(flag==0)
						flag= obj1.checkmat(mat, ID);
					if(flag==0)
						flag= obj14.checkmat(mat, ID);
					if(flag==0)
						flag= obj15.checkmat(mat, ID);
					if(flag==1)
						ID+=1;
				}
				else 
				{
					
					flag= obj13.checkmat(mat, ID);
					if(flag==0)
						flag= obj5.checkmat(mat, ID);
					if(flag==0)
						flag= obj6.checkmat(mat, ID);
					if(flag==0)
						flag= obj7.checkmat(mat, ID);
					if(flag==0)
						flag= obj8.checkmat(mat, ID);
					if(flag==0)
						flag= obj9.checkmat(mat, ID);
					if(flag==0)
						flag= obj10.checkmat(mat, ID);
					if(flag==0)
						flag= obj11.checkmat(mat, ID);
					if(flag==0)
						flag= obj12.checkmat(mat, ID);
					
					if(flag==0)
						flag= obj4.checkmat(mat, ID);
					if(flag==0)
						flag= obj14.checkmat(mat, ID);
					if(flag==0)
						flag= obj15.checkmat(mat, ID);
					if(flag==1)
						ID+=1;
					else
						System.out.println("Given input doesn't match any matrix type");
				}
					
			}
			else if(choice==2)
			{
				System.out.println("Enter the type of matrix you want");
				System.out.println("1. Rectangular");
				System.out.println("2. Row");
				System.out.println("3. Column");
				System.out.println("4. Square");
				System.out.println("5. Symmetric");
				System.out.println("6. Skew-symmetric");
				System.out.println("7. Upper triangular");
				System.out.println("8. Lower triangular");
				System.out.println("9. Singular");
				System.out.println("10. Diagonal");
				System.out.println("11. Scalar");
				System.out.println("12. Identity");
				System.out.println("13. Singleton");
				System.out.println("14. Ones");
				System.out.println("15. Null");
				System.out.println("Enter choice");
				int ch=sc.nextInt();
				if(ch==1 || ch==2 || ch==3 || ch==14 || ch==15)
				{
					System.out.println("Enter the number of rows");
					int a=sc.nextInt();
					System.out.println("Enter the number of columns");
					int b=sc.nextInt();
					if(ch==1)
						obj1.createmat(a,b,ID);
					if(ch==2)
						obj2.createmat(1,b,ID);
					if(ch==3)
						obj3.createmat(a,1,ID);
					if(ch==14)
						obj14.createmat(a,b,ID);
					if(ch==15)
						obj15.createmat(a,b,ID);
				}
				else
				{
					System.out.println("Enter the number of rows");
					int a=sc.nextInt();
					if(ch==4)
						obj4.createmat(a,a,ID);
					if(ch==5)
						obj5.createmat(a,a,ID);
					if(ch==6)
						obj6.createmat(a,a,ID);
					if(ch==7)
						obj7.createmat(a,a,ID);
					if(ch==8)
						obj8.createmat(a,a,ID);
					if(ch==9)
						obj9.createmat(a,a,ID);
					if(ch==10)
						obj10.createmat(a,a,ID);
					if(ch==11)
						obj11.createmat(a,a,ID);
					if(ch==12)
						obj12.createmat(a,a,ID);
					if(ch==13)
						obj13.createmat(a,a,ID);
				}
				ID++;
			}
			else if(choice==3)
			{
				System.out.println("Chose a matrix form 1 to" + (ID-1));
				int id=sc.nextInt();
				if(obj1.checkid(id)==true)
					obj1.change(id);
				else if(obj2.checkid(id)==true)
					obj2.change(id);
				else if(obj3.checkid(id)==true)
					obj3.change(id);
				else if(obj4.checkid(id)==true)
					obj4.change(id);
				else if(obj5.checkid(id)==true)
					obj5.change(id);
				else if(obj6.checkid(id)==true)
					obj6.change(id);
				else if(obj7.checkid(id)==true)
					obj7.change(id);
				else if(obj8.checkid(id)==true)
					obj8.change(id);
				else if(obj9.checkid(id)==true)
					obj9.change(id);
				else if(obj10.checkid(id)==true)
					obj10.change(id);
				else if(obj11.checkid(id)==true)
					obj11.change(id);
				else if(obj12.checkid(id)==true)
					obj12.change(id);
				else if(obj13.checkid(id)==true)
					obj13.change(id);
				else if(obj14.checkid(id)==true)
					obj14.change(id);
				else if(obj15.checkid(id)==true)
					obj15.change(id);
				else
					System.out.println("Invalid input");
			}
			else if(choice==4)
			{
				System.out.println("Enter the matrix id whose type you want to know from1 to" + (ID-1));
				int id=sc.nextInt();
				if(obj1.checkid(id)==true)
					obj1.mat_type_print();
				else if(obj2.checkid(id)==true)
					obj2.mat_type_print();
				else if(obj3.checkid(id)==true)
					obj3.mat_type_print();
				else if(obj4.checkid(id)==true)
					obj4.mat_type_print();
				else if(obj13.checkid(id)==true)
					obj13.mat_type_print();
				else if(obj5.checkid(id)==true)
					obj5.mat_type_print();
				else if(obj6.checkid(id)==true)
					obj6.mat_type_print();
				else if(obj7.checkid(id)==true)
					obj7.mat_type_print();
				else if(obj8.checkid(id)==true)
					obj8.mat_type_print();
				else if(obj9.checkid(id)==true)
					obj9.mat_type_print();
				else if(obj10.checkid(id)==true)
					obj10.mat_type_print();
				else if(obj11.checkid(id)==true)
					obj11.mat_type_print();
				else if(obj12.checkid(id)==true)
					obj12.mat_type_print();
				
				else if(obj14.checkid(id)==true)
					obj14.mat_type_print();
				else if(obj15.checkid(id)==true)
					obj15.mat_type_print();
				else
					System.out.println("Invalid input");
			}
			else if(choice==5 || choice==6)
			{
				System.out.println("Chose two matrices form 1 to" + (ID-1));
				System.out.println("Enter ID of the 1st chosen matrix");
				int id1=sc.nextInt();
				System.out.println("Enter ID of the 2nd chosen matrix");
				int id2=sc.nextInt();
				int [][] mat_a = null;
				int [][] mat_b=null;
				if(obj1.checkid(id1)==true)
					mat_a=obj1.search(id1);
				else if(obj2.checkid(id1)==true)
					mat_a=obj2.search(id1);
				else if(obj3.checkid(id1)==true)
					mat_a=obj3.search(id1);
				else if(obj4.checkid(id1)==true)
					mat_a=obj4.search(id1);
				else if(obj5.checkid(id1)==true)
					mat_a=obj5.search(id1);
				else if(obj6.checkid(id1)==true)
					mat_a=obj6.search(id1);
				else if(obj7.checkid(id1)==true)
					mat_a=obj7.search(id1);
				else if(obj8.checkid(id1)==true)
					mat_a=obj8.search(id1);
				else if(obj9.checkid(id1)==true)
					mat_a=obj9.search(id1);
				else if(obj10.checkid(id1)==true)
					mat_a=obj10.search(id1);
				else if(obj11.checkid(id1)==true)
					mat_a=obj11.search(id1);
				else if(obj12.checkid(id1)==true)
					mat_a=obj12.search(id1);
				else if(obj13.checkid(id1)==true)
					mat_a=obj13.search(id1);
				else if(obj14.checkid(id1)==true)
					mat_a=obj14.search(id1);
				else if(obj15.checkid(id1)==true)
					mat_a=obj15.search(id1);
				else
					System.out.println("Invalid choice");
				
				if(obj1.checkid(id2)==true)
					mat_b=obj1.search(id2);
				else if(obj2.checkid(id2)==true)
					mat_b=obj2.search(id2);
				else if(obj3.checkid(id2)==true)
					mat_b=obj3.search(id2);
				else if(obj4.checkid(id2)==true)
					mat_b=obj4.search(id2);
				else if(obj5.checkid(id2)==true)
					mat_b=obj5.search(id2);
				else if(obj6.checkid(id2)==true)
					mat_b=obj6.search(id2);
				else if(obj7.checkid(id2)==true)
					mat_b=obj7.search(id2);
				else if(obj8.checkid(id2)==true)
					mat_b=obj8.search(id2);
				else if(obj9.checkid(id2)==true)
					mat_b=obj9.search(id2);
				else if(obj10.checkid(id2)==true)
					mat_b=obj10.search(id2);
				else if(obj11.checkid(id2)==true)
					mat_b=obj11.search(id2);
				else if(obj12.checkid(id2)==true)
					mat_b=obj12.search(id2);
				else if(obj13.checkid(id2)==true)
					mat_b=obj13.search(id2);
				else if(obj14.checkid(id2)==true)
					mat_b=obj14.search(id2);
				else if(obj15.checkid(id2)==true)
					mat_b=obj15.search(id2);
				else
					System.out.println("Invalid choice");
				
				if(mat_a.length!=mat_b.length || mat_a[0].length!=mat_b[0].length)
					System.out.println("Different dimension, operation not possible");
				else
				{
					if(choice==5)
					{
					System.out.println("1. Addition");
					System.out.println("2. Subtraction");
					System.out.println("3. Multiplication");
					System.out.println("4. Division");
					System.out.println("Enter choice");
					int cho1=sc.nextInt();
					if(cho1==1)
						obmain.add(mat_a, mat_b);
					if(cho1==2)
						obmain.sub(mat_a, mat_b);
					if(cho1==3)
						obmain.mul(mat_a, mat_b);
					if(cho1==4)
						obmain.div(mat_a, mat_b);
					}
					else if(choice==6)
					{
						System.out.println("1. Element wise multiplication");
						System.out.println("2. Element wise division");
						int cho2=sc.nextInt();
						if(cho2==1)
							obmain.elewisemul(mat_a, mat_b);
						if(cho2==2)
							obmain.elewisediv(mat_a, mat_b);
					}
				}
			}
			else if(choice==7 || choice ==8 || choice==9 ||choice==10 || choice ==12)
			{
				System.out.println("Chose a matrix form 1 to" + (ID-1));
				int id=sc.nextInt();
				int [][]mat=null;
				
				if(obj1.checkid(id)==true)
					mat=obj1.search(id);
				else if(obj2.checkid(id)==true)
					mat=obj2.search(id);
				else if(obj3.checkid(id)==true)
					mat=obj3.search(id);
				else if(obj4.checkid(id)==true)
					mat=obj4.search(id);
				else if(obj5.checkid(id)==true)
					mat=obj5.search(id);
				else if(obj6.checkid(id)==true)
					mat=obj6.search(id);
				else if(obj7.checkid(id)==true)
					mat=obj7.search(id);
				else if(obj8.checkid(id)==true)
					mat=obj8.search(id);
				else if(obj9.checkid(id)==true)
					mat=obj9.search(id);
				else if(obj10.checkid(id)==true)
					mat=obj10.search(id);
				else if(obj11.checkid(id)==true)
					mat=obj11.search(id);
				else if(obj12.checkid(id)==true)
					mat=obj12.search(id);
				else if(obj13.checkid(id)==true)
					mat=obj13.search(id);
				else if(obj14.checkid(id)==true)
					mat=obj14.search(id);
				else if(obj15.checkid(id)==true)
					mat=obj15.search(id);
				else
				{
					System.out.println("Invalid input");
					continue;
				}
				if(choice==7)
					obmain.transpose(mat);
				else if(choice==8)
				{
					float [][]mat_inv=new float[mat.length][mat.length];
					obmain.inverse(mat, mat_inv, mat.length);
				}
				else if(choice==9)
				{
					System.out.println("1. Find row wise mean");
					System.out.println("2. Find column wise mean");
					System.out.println("3. Find overall mean");
					System.out.println("Enter choice");
					int cho3=sc.nextInt();
					if(cho3==1)
						obmain.row_mean(mat);
					else if(cho3==2)
						obmain.col_mean(mat);
					else if(cho3==3)
						obmain.mean(mat);
					else
						System.out.println("Invalid choice");
				}
				else if(choice==10)
					System.out.println("Determinant="+Matrix.Determinant(mat, mat.length));
				else if(choice==12)
					obmain.sumtrans(mat);
				
			}
			if(choice==11)
			{
				System.out.println("Do you allow using singleton matrices as a scalar value?");
				String input=sc.next();
				if(input.equals("yes"))
				{
					int [][] mat_a=null;
					int [][]mat_b=null;
					System.out.println("Chose a matrix form 1 to" + (ID-1));
					int id1=sc.nextInt();
					if(obj1.checkid(id1)==true)
						mat_a=obj1.search(id1);
					else if(obj2.checkid(id1)==true)
						mat_a=obj2.search(id1);
					else if(obj3.checkid(id1)==true)
						mat_a=obj3.search(id1);
					else if(obj4.checkid(id1)==true)
						mat_a=obj4.search(id1);
					else if(obj5.checkid(id1)==true)
						mat_a=obj5.search(id1);
					else if(obj6.checkid(id1)==true)
						mat_a=obj6.search(id1);
					else if(obj7.checkid(id1)==true)
						mat_a=obj7.search(id1);
					else if(obj8.checkid(id1)==true)
						mat_a=obj8.search(id1);
					else if(obj9.checkid(id1)==true)
						mat_a=obj9.search(id1);
					else if(obj10.checkid(id1)==true)
						mat_a=obj10.search(id1);
					else if(obj11.checkid(id1)==true)
						mat_a=obj11.search(id1);
					else if(obj12.checkid(id1)==true)
						mat_a=obj12.search(id1);
					else if(obj13.checkid(id1)==true)
						mat_a=obj13.search(id1);
					else if(obj14.checkid(id1)==true)
						mat_a=obj14.search(id1);
					else if(obj15.checkid(id1)==true)
						mat_a=obj15.search(id1);
					else
					{
						System.out.println("Invalid choice");
						continue;
					}
					System.out.println("Enter id of the singleton matrix");
					int id2=sc.nextInt();
					if(obj13.checkid(id2)==true)
					{
						mat_b=obj13.search(id2);
						obmain.singscal(mat_a,mat_b);
					}
					else
						System.out.println("Invalid choice");
				}
			}
			else if(choice==14)
			{
				int [][] mat_a=null;
				int [][]mat_b=null;
				System.out.println("Enter id of a square matrix");
				int id1=sc.nextInt();
				if(obj4.checkid(id1)==true)
					mat_a=obj4.search(id1);
				else if(obj5.checkid(id1)==true)
					mat_a=obj5.search(id1);
				else if(obj6.checkid(id1)==true)
					mat_a=obj6.search(id1);
				else if(obj7.checkid(id1)==true)
					mat_a=obj7.search(id1);
				else if(obj8.checkid(id1)==true)
					mat_a=obj8.search(id1);
				else if(obj9.checkid(id1)==true)
					mat_a=obj9.search(id1);
				else if(obj10.checkid(id1)==true)
					mat_a=obj10.search(id1);
				else if(obj11.checkid(id1)==true)
					mat_a=obj11.search(id1);
				else if(obj12.checkid(id1)==true)
					mat_a=obj12.search(id1);
				else if(obj13.checkid(id1)==true)
					mat_a=obj13.search(id1);
				else if(obj14.checkid(id1)==true)
				{
					mat_a=obj14.search(id1);
					if(mat_a.length!=mat_a[0].length)
					{
						System.out.println("Invalid choice");
						continue;
					}
				}
				else if(obj15.checkid(id1)==true)
				{
					mat_a=obj15.search(id1);
					if(mat_a.length!=mat_a[0].length)
					{
						System.out.println("Invalid choice");
						continue;
					}
				}
				else
				{
					System.out.println("Invalid choice");
					continue;
				}
				System.out.println("Choose a column matrix from a-g. Note: this should have same number of rows as the one you entered just now ");
				int id2=sc.nextInt();
				if(obj3.checkid(id2)==false)
				{
					System.out.println("Invalid choice");
					continue;
				}
				else
				{
					if(obj3.search(id2).length!=mat_a.length)
					{
						System.out.println("Invalid choice");
						continue;
					}
					else
						mat_b=obj3.search(id2);
				}
				obj4.solvelin(mat_a, mat_b);
			}
			else if(choice==15)
			{
				System.out.println("Enter the type of matrix you want");
				System.out.println("1. Rectangular");
				System.out.println("2. Row");
				System.out.println("3. Column");
				System.out.println("4. Square");
				System.out.println("5. Symmetric");
				System.out.println("6. Skew-symmetric");
				System.out.println("7. Upper triangular");
				System.out.println("8. Lower triangular");
				System.out.println("9. Singular");
				System.out.println("10. Diagonal");
				System.out.println("11. Scalar");
				System.out.println("12. Identity");
				System.out.println("13. Singleton");
				System.out.println("14. Ones");
				System.out.println("15. Null");
				System.out.println("Enter choice");
				int ch=sc.nextInt();
				if(ch==1)
				{
					obj1.display();
					obj2.display();
					obj3.display();
				}
				if(ch==2)
					obj2.display();
				if(ch==3)
					obj3.display();
				if(ch==4)
				{
					obj4.display();
					obj6.display();
					obj7.display();
					obj8.display();
					obj9.display();
					obj10.display();
					obj11.display();
					obj12.display();
					obj13.display();
				}
				if(ch==5)
					obj5.display();
				if(ch==6)
					obj6.display();
				if(ch==7)
					obj7.display();
				if(ch==8)
					obj8.display();
				if(ch==9)
					obj9.display();
				if(ch==10)
					obj10.display();
				if(ch==11)
					obj11.display();
				if(ch==12)
					obj12.display();
				if(ch==13)
					obj13.display();
				if(ch==14)
					obj14.display();
				if(ch==15)
					obj15.display();
			}
		}
	}
}

class Matrix 
{
	void transpose(int[][] mat)
	{
		int a=mat.length;
		int b=mat[0].length;
		int [][] trans=new int [b][a];
		for (int i = 0; i < a; i++) 
		{
			 
            for (int j = 0; j < b; j++) 
            {

                trans[j][i] = mat[i][j];
            }
        }
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				System.out.print(trans[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	int[][] transpose_ret(int[][] mat)
	{
		int a=mat.length;
		int b=mat[0].length;
		int [][] trans=new int [b][a];
		for (int i = 0; i < a; i++) 
		{
			 
            for (int j = 0; j < b; j++) 
            {

                trans[j][i] = mat[i][j];
            }
        }
		return trans;
		
	}
	static void Cofactor(int [][] mat,int [][] temp, int p, int q, int a )
	{
		int r=0, c=0;
		for (int i = 0; i < a; i++)
		{
			for (int j = 0; j < a; j++)
			{
				if (i != p && j != q)
				{
				    temp[r][c++] = mat[i][j];
				    if (c == a - 1)
				    {
				        c = 0;
				        r++;
				    }
				}
			}
		}
	}
	static int Determinant(int mat[][], int a)
	{
			int D = 0; 
			if (a == 1)
			return mat[0][0];
			

			int temp[][] = new int[a][a];
			
			int sign = 1;		//sign multiplier

			for (int k = 0; k < a; k++)
			{
				Cofactor(mat, temp, 0, k, a);
				D += sign * mat[0][k]* Determinant(temp, a - 1);
			

				sign = -sign;
			}
			
			return D;
	}
	static void adjoint(int mat[][],int [][]adj, int a)
	{
	    if (a == 1)
	    {
	        adj[0][0] = 1;
	        return;
	    }
	 
	    int sign = 1;
	    int [][]temp = new int[a][a];
	 
	    for (int i = 0; i < a; i++)
	    {
	        for (int j = 0; j < a; j++)
	        {

	            Cofactor(mat, temp, i, j, a);

	            sign = ((i + j) % 2 == 0)? 1: -1;
	 
	            adj[j][i] = (sign)*(Determinant(temp, a-1));
	        }
	    }
	}
	 
	void inverse(int mat[][], float [][]inverse, int a)
	{

	    int det = Determinant(mat, a);
	    if (det == 0)
	    {
	        System.out.print("Singular matrix, can't find its inverse");
	        return;
	    }
	    int [][]adj = new int[a][a];
	    adjoint(mat, adj, a);
	    for (int i = 0; i < a; i++)
	    {
	        for (int j = 0; j < a; j++)
	        {
	            inverse[i][j] = adj[i][j]/(float)det;
	        }
	    }
	    for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				System.out.print(inverse[i][j] + " ");
			}
			System.out.println();
		}
	}
	float[][] inverse_mat(int mat[][], float [][]inverse, int a)
	{

	    int det = Determinant(mat, a);
	    if (det == 0)
	    {
	        System.out.print("Singular matrix, can't find its inverse");
	        return null;
	    }
	    int [][]adj = new int[a][a];
	    adjoint(mat, adj, a);
	    for (int i = 0; i < a; i++)
	    {
	        for (int j = 0; j < a; j++)
	        {
	            inverse[i][j] = adj[i][j]/(float)det;
	        }
	    }
	    return inverse;
	}
	void add(int [][] mat_a, int [][] mat_b)
	{
		int a=mat_a.length;
		int b=mat_a[0].length;
		int [][] mat_res = new int [a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				mat_res[i][j]=mat_a[i][j]+mat_b[i][j];
			}
		}
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(mat_res[i][j] + " ");
			}
			System.out.println();
		}
	}
	void sub(int[][] mat_a, int [][]mat_b)
	{
		int a=mat_a.length;
		int b=mat_a[0].length;
		int [][] mat_res = new int [a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				mat_res[i][j]=mat_a[i][j]-mat_b[i][j];
			}
		}
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(mat_res[i][j] + " ");
			}
			System.out.println();
		}
	}
	void mul(int [][]mat_a, int [][]mat_b)
	{
		int a=mat_a.length;
		int b=mat_a[0].length;
		int [][] mat_res = new int [a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				mat_res[i][j]=mat_a[i][j]*mat_b[j][i];
			}
		}
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(mat_res[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	void div(int [][]mat_a, int [][]mat_b)
	{
		int a=mat_a.length;
		int b=mat_a[0].length;
		float[][] mat_binv=new float[a][a];
		mat_binv=inverse_mat(mat_b,mat_binv, a);
		float [][] mat_res = new float [a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				mat_res[i][j]=mat_a[i][j]*mat_b[j][i];
			}
		}
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(mat_res[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	void elewisemul(int [][]mat_a, int [][]mat_b)
	{
		int a=mat_a.length;
		int b=mat_a[0].length;
		int [][] mat_res = new int [a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				mat_res[i][j]=mat_a[i][j]*mat_b[i][j];
			}
		}
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(mat_res[i][j] + " ");
			}
			System.out.println();
		}
	}
	void elewisediv(int [][]mat_a, int [][]mat_b)
	{
		int a=mat_a.length;
		int b=mat_a[0].length;
		int [][] mat_res = new int [a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				mat_res[i][j]=mat_a[i][j]/mat_b[i][j];
			}
		}
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(mat_res[i][j] + " ");
			}
			System.out.println();
		}
	}
	void row_mean(int[][]mat)
	{
		int a=mat.length;
		int b=mat[0].length;
		float [][]row_mean=new float[1][a];
		int r_sum=0;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				r_sum+=mat[j][i];
			}
			row_mean[0][i]=r_sum/a;
			r_sum=0;
		}
		for(int i=0;i<a;i++)
		{
			System.out.print(row_mean[0][i] + "  ");
		}
		System.out.println();
		
	}
	void col_mean(int[][]mat) {
		int a=mat.length;
		int b=mat[0].length;
		float [][]col_mean=new float[b][1];
		int c_sum=0;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				c_sum+=mat[i][j];
			}
			col_mean[i][0]=c_sum/b;
			c_sum=0;
			
		}
		for(int j=0;j<b;j++)
		{
			System.out.print(col_mean[j][0] + "  ");
		}
		System.out.println();
	}
	void mean(int[][] mat)
	{
		int a=mat.length;
		int b=mat[0].length;
		float mean_all;
		int sum=0;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				sum+=mat[i][j];
			}
		}
		
		mean_all=sum/(a*b);
		System.out.println(mean_all);
	}
	void sumtrans(int [][]mat)
	{
		int a=mat.length;
		int b=mat[0].length;
		int [][] AAT=new int[a][b];
		int [][] trans=transpose_ret(mat);
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				AAT[i][j]=mat[i][j]+trans[i][j];
			}
		}
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(AAT[i][j] + " ");
			}
			System.out.println();
		}
	}
	void singscal(int [][]mat_a,int [][]mat_b)
	{
		int a=mat_a.length;
		int b=mat_a[0].length;
		int val=mat_b[0][0];
		
		int [][]mat_res=new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				mat_res[i][j]=val*mat_a[i][j];
			}
		}
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(mat_res[i][j] + " ");
			}
			System.out.println();
		}
	}
}
class Rect implements check
{
	Scanner sc = new Scanner (System.in);
	private Map<Integer, int[][]> rectangular = new HashMap<Integer, int[][]>();
	public Rect()
	{
	}
	public Map<Integer, int[][]> getRect()
	{
		return rectangular;
	}
	public int checkmat(int[][] mat,int ID)
	{
		int a=mat.length;
		int b=mat[0].length;
		if(a!=b)
		{
			rectangular.put(ID,mat);
			return 1;	
		}
		else
			return 0;
	}
	void createmat(int a, int b, int ID)
	{
		int [][]mat=new int[a][b];
		int min = 1;
		int max = 5;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				mat[i][j]=(int)(Math.random()*(max-min+1)+min);
			}
		}
		rectangular.put(ID,mat);	
	}
	void change(int ID)
	{
		int [][]mat=rectangular.get(ID);
		int r=mat.length;
		int c=mat[0].length;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element");
				mat[i][j]=sc.nextInt();
			}
		}
		rectangular.put(ID, mat);
	}
	boolean checkid(int id)
	{
		boolean check = rectangular.containsKey(id);
		return check;
	}
	public int[][] search(int ID)
	{
		return rectangular.get(ID);
	}
	void display()
	{
		for(Integer key : rectangular.keySet()) 
		{
			int r=rectangular.get(key).length;
			int c=rectangular.get(key)[0].length;
			System.out.print(key);
			System.out.println();
			for(int i=0;i<r;i++)
			{
				
				for(int j=0;j<c;j++)
				{
					System.out.print(rectangular.get(key)[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	void mat_type_print()
	{
		System.out.println("Rectangular");
	}
}
class Row extends Rect implements check
{
	Scanner sc = new Scanner (System.in);
	private Map<Integer, int[][]> row = new HashMap<Integer, int[][]>();
	public Row()
	{
		super();
	}
	public Map<Integer, int[][]> getRow()
	{
		return getRect();
	}
	@Override
	public int checkmat(int[][] mat, int ID)
	{
		int a=mat.length;
		if(a==1)
		{
			row.put(ID,mat);
			return 1;
		}
		else
			return 0;	
	}
	@Override
	void createmat(int a, int b, int ID)
	{
		int [][]mat=new int[a][b];
		int min = 1;
		int max = 5;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				mat[i][j]=(int)(Math.random()*(max-min+1)+min);
			}
		}
		row.put(ID,mat);		
	}
	@Override
	void change(int ID)
	{
		int [][]mat=row.get(ID);
		int r=mat.length;
		int c=mat[0].length;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element");
				mat[i][j]=sc.nextInt();
			}
		}
		row.put(ID, mat);
	}
	@Override
	boolean checkid(int id)
	{
		boolean check = row.containsKey(id);
		return check;
	}
	@Override
	public int[][] search(int ID)
	{
		return row.get(ID);
	}
	@Override
	void display()
	{
		for(Integer key : row.keySet()) 
		{
			int r=row.get(key).length;
			int c=row.get(key)[0].length;
			System.out.print(key);
			System.out.println();
			for(int i=0;i<r;i++)
			{
				
				for(int j=0;j<c;j++)
				{
					System.out.print(row.get(key)[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	void mat_type_print()
	{
		System.out.println("Row");
		System.out.println("Rectangular");
	}
}
class Column extends Rect implements check
{
	Scanner sc = new Scanner (System.in);
	private Map<Integer, int[][]> col = new HashMap<Integer, int[][]>();
	public Column()
	{
		super();
	}
	public Map<Integer, int[][]> getRow()
	{
		return getRect();
	}
	@Override
	public int checkmat(int[][] mat,int ID)
	{
		int b=mat[0].length;
		if(b==1)
		{
			col.put(ID,mat);
			return 1;
		}
		return 0;
	}
	@Override
	void createmat(int a, int b, int ID)
	{
		int [][]mat=new int[a][b];
		int min = 1;
		int max = 5;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				mat[i][j]=(int)(Math.random()*(max-min+1)+min);
			}
		}
		col.put(ID,mat);	
	}
	@Override
	void change(int ID)
	{
		int [][]mat=col.get(ID);
		int r=mat.length;
		int c=mat[0].length;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element");
				mat[i][j]=sc.nextInt();
			}
		}
		col.put(ID, mat);
	}
	@Override
	boolean checkid(int id)
	{
		boolean check = col.containsKey(id);
		return check;
	}
	@Override
	public int[][] search(int ID)
	{
		return col.get(ID);
	}
	@Override
	void display()
	{
		for(Integer key : col.keySet()) 
		{
			int r=col.get(key).length;
			int c=col.get(key)[0].length;
			System.out.print(key);
			System.out.println();
			for(int i=0;i<r;i++)
			{
				
				for(int j=0;j<c;j++)
				{
					System.out.print(col.get(key)[i][j] + " ");
				}
				System.out.println();
			}
		}
		
	}
	void mat_type_print()
	{
		System.out.println("Column");
		System.out.println("Rectangular");
	}
}
class Square implements check
{
	Scanner sc = new Scanner (System.in);
	private Map<Integer, int[][]> square = new HashMap<Integer, int[][]>();
	public Square()
	{
	}
	public Map<Integer, int[][]> getSquare()
	{
		return square;
	}
	public int checkmat(int[][] mat, int ID)
	{
		int a=mat.length;
		int b=mat[0].length;
		if(a==b)
		{
			square.put(ID,mat);
			return 1;
		}
		return 0;
	}
	void createmat(int a, int b, int ID)
	{
		int [][]mat=new int[a][b];
		int min = 1;
		int max = 5;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				mat[i][j]=(int)(Math.random()*(max-min+1)+min);
			}
		}
		square.put(ID,mat);	
	}
	void change(int ID)
	{
		int [][]mat=square.get(ID);
		int r=mat.length;
		int c=mat[0].length;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element");
				mat[i][j]=sc.nextInt();
			}
		}
		square.put(ID, mat);
	}
	int [][] transpose(int[][] mat, int a, int b)
	{
		int [][] trans=new int [b][a];
		for (int i = 0; i < a; i++) 
		{
			 
            for (int j = 0; j < b; j++) 
            {

                trans[j][i] = mat[i][j];
            }
        }
		return trans;

		
	}
	static void Cofactor(int [][] mat,int [][] temp, int p, int q, int a )
	{
		int r=0, c=0;
		for (int i = 0; i < a; i++)
		{
			for (int j = 0; j < a; j++)
			{
				if (i != p && j != q)
				{
				    temp[r][c++] = mat[i][j];
				    if (c == a - 1)
				    {
				        c = 0;
				        r++;
				    }
				}
			}
		}
	}
	static int Determinant(int mat[][], int a)
	{
			int D = 0; 
			if (a == 1)
				return mat[0][0];
			

			int temp[][] = new int[a][a];
			
			int sign = 1;		//sign multiplier

			for (int k = 0; k < a; k++)
			{
				// Getting Cofactor of mat[0][f]
				Cofactor(mat, temp, 0, k, a);
				D += sign * mat[0][k]* Determinant(temp, a - 1);
			

				sign = -sign;
			}
			
			return D;
	}
	static void adjoint(int mat[][],int [][]adj, int a)
	{
	    if (a == 1)
	    {
	        adj[0][0] = 1;
	        return;
	    }
	 
	    int sign = 1;
	    int [][]temp = new int[a][a];
	 
	    for (int i = 0; i < a; i++)
	    {
	        for (int j = 0; j < a; j++)
	        {

	            Cofactor(mat, temp, i, j, a);

	            sign = ((i + j) % 2 == 0)? 1: -1;
	 
	            adj[j][i] = (sign)*(Determinant(temp, a-1));
	        }
	    }
	}
	 
	void inverse(int mat[][], float [][]inverse, int a)
	{

	    int det = Determinant(mat, a);
	    if (det == 0)
	    {
	        System.out.print("Singular matrix, can't find its inverse");
	        return;
	    }
	 
	    int [][]adj = new int[a][a];
	    adjoint(mat, adj, a);
	    for (int i = 0; i < a; i++)
	    {
	        for (int j = 0; j < a; j++)
	        {
	            inverse[i][j] = adj[i][j]/(float)det;
	        }
	    }
	    for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				System.out.print(inverse[i][j] + " ");
			}
			System.out.println();
		}
	}
	float[][] inverse_mat(int mat[][], float [][]inverse, int a)
	{

	    int det = Determinant(mat, a);
	    if (det == 0)
	    {
	        System.out.print("Singular matrix, can't find its inverse");
	        return null;
	    }
	    int [][]adj = new int[a][a];
	    adjoint(mat, adj, a);
	    for (int i = 0; i < a; i++)
	    {
	        for (int j = 0; j < a; j++)
	        {
	            inverse[i][j] = adj[i][j]/(float)det;
	        }
	    }
	    return inverse;
	}
	void solvelin(int [][] mat_a, int [][]mat_b)
	{
		
		int r=mat_a.length;
		int r1=mat_b[0].length;
		float [][] mat_ainv=new float[r][r];
		mat_ainv=inverse_mat(mat_a, mat_ainv, r);
		float [][] mat_res = new float [r][1];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				mat_res[i][0]+=mat_ainv[i][j]*mat_b[j][0];
			}
			
		}
		for(int i=0;i<r;i++)
		{
			System.out.println(mat_res[i][0]);
		}
		
	}
	boolean checkid(int id)
	{
		boolean check = square.containsKey(id);
		return check;
	}
	public int[][] search(int ID)
	{
		return square.get(ID);
	}
	void display()
	{
		for(Integer key : square.keySet()) 
		{
			int r=square.get(key).length;
			int c=square.get(key)[0].length;
			System.out.print(key);
			System.out.println();
			for(int i=0;i<r;i++)
			{
				
				for(int j=0;j<c;j++)
				{
					System.out.print(square.get(key)[i][j] + " ");
				}
				System.out.println();
			}
		}
		
	}
	void mat_type_print()
	{
		System.out.println("Square");
	}
}
class Symmetric extends Square implements check
{
	Scanner sc = new Scanner (System.in);
	private Map<Integer, int[][]> sym = new HashMap<Integer, int[][]>();
	public Symmetric()
	{
		super();
	}
	public Map<Integer, int[][]> getSymmetric()
	{
		return getSquare();
	}
	@Override
	public int checkmat(int[][] mat, int ID)
	{
		int a=mat.length;
		int b=mat[0].length;
		int f=0;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(i>j)
				{
					if(mat[i][j]!=mat[j][i])
					{
						f=1;
						break;
					}
				}
			}
		}
		if (f == 0) 
        {
        	sym.put(ID,mat);
        	return 1;
        }
		return 0;
	}
	@Override
	void createmat(int a, int b, int ID)
	{
		int [][]mat=new int[a][b];
		int min = 1;
		int max = 5;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(i>j)
				{
					mat[i][j]=mat[j][i];
				}
				else
				{
					mat[i][j]=(int)(Math.random()*(max-min+1)+min);
				}
			}
		}
		sym.put(ID,mat);	
	}
	@Override
	void change(int ID)
	{
		int [][]mat=sym.get(ID);
		int r=mat.length;
		int c=mat[0].length;
		int f=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element");
				int ele=sc.nextInt();
				if(i>j)
				{
					if(mat[j][i]!=ele)
					{
						System.out.println("Change not possible");
						f=1;
						break;
					}
					else
						mat[i][j]=ele;
				}
				else
					mat[i][j]=ele;
				
			}
		}
		if(f==0)
			sym.put(ID, mat);
	}
	@Override
	boolean checkid(int id)
	{
		boolean check = sym.containsKey(id);
		return check;
	}
	@Override
	public int[][] search(int ID)
	{
		return sym.get(ID);
	}
	@Override
	void display()
	{
		for(Integer key : sym.keySet()) 
		{
			int r=sym.get(key).length;
			int c=sym.get(key)[0].length;
			System.out.print(key);
			System.out.println();
			for(int i=0;i<r;i++)
			{
				
				for(int j=0;j<c;j++)
				{
					System.out.print(sym.get(key)[i][j] + " ");
				}
				System.out.println();
			}
		}	
	}
	void mat_type_print()
	{
		System.out.println("Symmetric");
		System.out.println("Square");
	}
}
class Skew extends Square implements check
{
	Scanner sc = new Scanner (System.in);
	private Map<Integer, int[][]> skew = new HashMap<Integer, int[][]>();
	public Skew()
	{
		super();
	}
	public Map<Integer, int[][]> getSkew()
	{
		return getSquare();
	}
	@Override
	public int checkmat(int[][] mat, int ID)
	{
		int a=mat.length;
		int b=mat[0].length;
		int f=0;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(i>j)
				{
					if(mat[i][j]!=-mat[j][i])
					{
						f=1;
						break;
					}
				}
			}
		}
		if (f == 0) 
        {
        	skew.put(ID,mat);
        	return 1;
        }
		return 0;
	}
	@Override
	void createmat(int a, int b, int ID)
	{
		int [][]mat=new int[a][b];
		int min = 1;
		int max = 5;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(i>j)
				{
					mat[i][j]=-mat[j][i];
				}
				else
				{
					mat[i][j]=(int)(Math.random()*(max-min+1)+min);
				}
			}
		}
		skew.put(ID,mat);	
	}
	@Override
	void change(int ID)
	{
		int [][]mat=skew.get(ID);
		int r=mat.length;
		int c=mat[0].length;
		int f=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element");
				int ele=sc.nextInt();
				if(i>j)
				{
					if(mat[j][i]!=-ele)
					{
						System.out.println("Change not possible");
						f=1;
						break;
					}
					else
						mat[i][j]=ele;
				}
				else
					mat[i][j]=ele;
			}
		}
		if(f==0)
			skew.put(ID, mat);
	}
	@Override
	boolean checkid(int id)
	{
		boolean check = skew.containsKey(id);
		return check;
	}
	@Override
	public int[][] search(int ID)
	{
		return skew.get(ID);
	}
	@Override
	void display()
	{
		for(Integer key : skew.keySet()) 
		{
			int r=skew.get(key).length;
			int c=skew.get(key)[0].length;
			System.out.print(key);
			System.out.println();
			for(int i=0;i<r;i++)
			{
				
				for(int j=0;j<c;j++)
				{
					System.out.print(skew.get(key)[i][j] + " ");
				}
				System.out.println();
			}
		}
		
	}
	void mat_type_print()
	{
		System.out.println("Skew-symmetric");
		System.out.println("Square");
	}
}
class Upper extends Square implements check
{
	Scanner sc = new Scanner (System.in);
	private Map<Integer, int[][]> uptri = new HashMap<Integer, int[][]>();
	public Upper()
	{
		super();

	}
	public Map<Integer, int[][]> getUpper()
	{
		return getSquare();
	}
	@Override
	public int checkmat(int[][] mat, int ID)
	{
		int a=mat.length;
		int f=0;
		for (int i = 1; i < a; i++)
		{
			for (int j = 0; j < i; j++)
			{
				if (mat[i][j] != 0)
				{
					f = 1;
					break;
				}
			}
		}
		if (f == 0)
		{
			uptri.put(ID,mat);
			return 1;
		}
		return 0;
	}
	@Override
	void createmat(int a, int b, int ID)
	{
		int [][]mat=new int[a][b];
		int min = 1;
		int max = 5;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(i<=j)
				{
					mat[i][j]=(int)(Math.random()*(max-min+1)+min);
				}
				else
				{
					mat[i][j]=0;
				}
			}
		}
		uptri.put(ID,mat);	
	}
	@Override
	boolean checkid(int id)
	{
		boolean check = uptri.containsKey(id);
		return check;
	}
	@Override
	void change(int ID)
	{
		int [][]mat=uptri.get(ID);
		int r=mat.length;
		int c=mat[0].length;
		int f=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element");
				int ele=sc.nextInt();
				if(i>j)
				{
					if(ele!=0 )
					{
						System.out.println("Change not possible");
						f=1;
						break;
					}
					else
						mat[i][j]=ele;
				}
				else
					mat[i][j]=ele;
				
			}
		}
		if(f==0)
			uptri.put(ID, mat);
	}
	@Override
	public int[][] search(int ID)
	{
		return uptri.get(ID);
	}
	void display()
	{
		for(Integer key : uptri.keySet()) 
		{
			int r=uptri.get(key).length;
			int c=uptri.get(key)[0].length;
			System.out.print(key);
			System.out.println();
			for(int i=0;i<r;i++)
			{
				
				for(int j=0;j<c;j++)
				{
					System.out.print(uptri.get(key)[i][j] + " ");
				}
				System.out.println();
			}
		}	
	}
	void mat_type_print()
	{
		System.out.println("Upper-triangular");
		System.out.println("Square");
	}
}
class Lower extends Square implements check
{
	Scanner sc = new Scanner (System.in);
	private Map<Integer, int[][]> lowtri = new HashMap<Integer, int[][]>();
	public Lower()
	{
		super();
	}
	public Map<Integer, int[][]> getLower()
	{
		return getSquare();
	}
	@Override
	public int checkmat(int[][] mat, int ID)
	{
		int a=mat.length;
		int f=0;
		for (int i = 0; i < a; i++)
		{
			for (int j = i+1; j < a; j++)
			{
				if (mat[i][j] != 0)
				{
					f = 1;
					break;
				}
			}
		}
		if (f == 0)
		{
			lowtri.put(ID,mat);
			return 1;
		}
		return 0;
	}
	@Override
	void createmat(int a, int b, int ID)
	{
		int [][]mat=new int[a][b];
		int min = 1;
		int max = 5;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(i>=j)
				{
					mat[i][j]=(int)(Math.random()*(max-min+1)+min);
				}
				else
				{
					mat[i][j]=0;
				}
			}
		}
		lowtri.put(ID,mat);
	}
	@Override
	void change(int ID)
	{
		int [][]mat=lowtri.get(ID);
		int r=mat.length;
		int c=mat[0].length;
		int f=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element");
				int ele=sc.nextInt();
				if(i<j)
				{
					if(ele!=0 )
					{
						System.out.println("Change not possible");
						f=1;
						break;
					}
					else
						mat[i][j]=ele;
				}
				else
					mat[i][j]=ele;
				
			}
		}
		if (f==0)
			lowtri.put(ID, mat);
	}
	@Override
	boolean checkid(int id)
	{
		boolean check = lowtri.containsKey(id);
		return check;
	}
	@Override
	public int[][] search(int ID)
	{
		return lowtri.get(ID);
	}
	@Override
	void display()
	{
		for(Integer key : lowtri.keySet()) 
		{
			int r=lowtri.get(key).length;
			int c=lowtri.get(key)[0].length;
			System.out.print(key);
			System.out.println();
			for(int i=0;i<r;i++)
			{
				
				for(int j=0;j<c;j++)
				{
					System.out.print(lowtri.get(key)[i][j] + " ");
				}
				System.out.println();
			}
		}	
	}
	void mat_type_print()
	{
		System.out.println("Lower-triangular");
		System.out.println("Square");
	}
}
class Singular extends Square implements check
{
	Scanner sc = new Scanner (System.in);
	private Map<Integer, int[][]> singular = new HashMap<Integer, int[][]>();
	public Singular() {
		super();
	}
	@Override
	public int checkmat(int[][] mat,int ID)
	{
		int a=mat.length;
		if(Determinant(mat, a)==0)
		{
			singular.put(ID,mat);
			return 1;
		}
		return 0;
	}
	@Override
	void createmat(int a, int b, int ID)
	{
		int [][]mat=new int[a][b];
		int min = 1;
		int max = 5;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(i<=j)
				{
					mat[i][j]=(int)(Math.random()*(max-min+1)+min);
				}
				else
				{
					mat[i][j]=0;
				}
			}
		}
		singular.put(ID,mat);	
	}
	@Override
	void change(int ID)
	{
		int [][]mat=singular.get(ID);
		int r=mat.length;
		int c=mat[0].length;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element");
				mat[i][j]=sc.nextInt();
				
			}
		}
		int d=Determinant(mat, r);
		if(d==0)
			singular.put(ID, mat);
		else
			System.out.println("Change not possible");
	}
	@Override
	boolean checkid(int id)
	{
		boolean check = singular.containsKey(id);
		return check;
	}
	@Override
	public int[][] search(int ID)
	{
		return singular.get(ID);
	}
	@Override
	void display()
	{
		for(Integer key : singular.keySet()) 
		{
			int r=singular.get(key).length;
			int c=singular.get(key)[0].length;
			System.out.print(key);
			System.out.println();
			for(int i=0;i<r;i++)
			{
				
				for(int j=0;j<c;j++)
				{
					System.out.print(singular.get(key)[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	void mat_type_print()
	{
		System.out.println("Singular");
		System.out.println("Square");
	}
}
class Diagonal extends Square implements check
{
	Scanner sc = new Scanner (System.in);
	private Map<Integer, int[][]> dia = new HashMap<Integer, int[][]>();
	public Diagonal()
	{
		super();
	}
	public Map<Integer, int[][]> getDiagonal()
	{
		return getSquare();
	}
	@Override
	public int checkmat(int[][] mat, int ID)
	{
		int a=mat.length;
		int f=0;
		for (int i = 0; i < a; i++)
		{
			for (int j = 0; j < a; j++)
			{
				if(j==i)
				{
					if(mat[i][j]!=1)
					{
						f=1;
						break;
					}
				}
				else 
				{
					if (mat[i][j] != 0)
					{
						f = 1;
						break;
					}
				}
			}
		}
		if (f == 0)
		{
			dia.put(ID,mat);
			return 1;
		}return 0;	
	}
	@Override
	void createmat(int a, int b, int ID)
	{
		int [][]mat=new int[a][b];
		int min = 1;
		int max = 5;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(i==j)
				{
					mat[i][j]=(int)(Math.random()*(max-min+1)+min);
				}
				else
				{
					mat[i][j]=0;
				}
			}
		}
		dia.put(ID,mat);	
	}
	@Override
	void change(int ID)
	{
		int [][]mat=dia.get(ID);
		int r=mat.length;
		int c=mat[0].length;
		int f=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element");
				int ele=sc.nextInt();
				if(i!=j)
				{
					if(ele!=0)
					{
						System.out.println("Change not possible");
						f=1;
						break;
					}
					else
						mat[i][j]=ele;
				}
				
			}
		}
		if (f==0)
			dia.put(ID, mat);
		
	}
	@Override
	boolean checkid(int id)
	{
		boolean check = dia.containsKey(id);
		return check;
	}
	@Override
	public int[][] search(int ID)
	{
		return dia.get(ID);
	}
	@Override
	void display()
	{
		for(Integer key : dia.keySet()) 
		{
			int r=dia.get(key).length;
			int c=dia.get(key)[0].length;
			System.out.print(key);
			System.out.println();
			for(int i=0;i<r;i++)
			{
				
				for(int j=0;j<c;j++)
				{
					System.out.print(dia.get(key)[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	void mat_type_print()
	{
		System.out.println("Diagonal");
		System.out.println("Square");
	}
}
class Scalar extends Square implements check
{
	Scanner sc = new Scanner (System.in);
	private Map<Integer, int[][]> scal = new HashMap<Integer, int[][]>();
	public Scalar()
	{
		super();
	}
	public Map<Integer, int[][]> getScalar()
	{
		return getSquare();
	}
	@Override
	public int checkmat(int[][] mat,int ID)
	{
		int a=mat.length;
		int val=mat[0][0];
		int f=0;
		for (int i = 0; i < a; i++)
		{
			for (int j = 0; j < a; j++)
			{
				if(j==i && mat[i][j]!=val)
				{
					f=1;
					break;
				}	
			}
		}
		if (f == 0)
		{
			scal.put(ID,mat);
			return 1;
		}return 0;
	}
	@Override
	void createmat(int a, int b, int ID)
	{
		int [][]mat=new int[a][b];
		int min = 1;
		int max = 5;
		mat[0][0]=(int)(Math.random()*(max-min+1)+min);
		int val=mat[0][0];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(i==j && i!=0)
				{
					mat[i][j]=val;
				}
				else
				{
					mat[i][j]=(int)(Math.random()*(max-min+1)+min);
				}
			}
		}
		scal.put(ID,mat);	
	}
	@Override
	void change(int ID)
	{
		int [][]mat=scal.get(ID);
		int r=mat.length;
		int c=mat[0].length;
		int f=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element");
				int ele=sc.nextInt();
				if(i>0 && i==j)
				{
					if(ele!=mat[0][0])
					{
						System.out.println("Change not possible");
						f=1;
						break;
					}
					else
						mat[i][j]=ele;
				}
				else
					mat[i][j]=ele;
				
			}
		}
		if(f==0)
			scal.put(ID, mat);
		
	}
	@Override
	boolean checkid(int id)
	{
		boolean check = scal.containsKey(id);
		return check;
	}
	@Override
	public int[][] search(int ID)
	{
		return scal.get(ID);
	}
	@Override
	void display()
	{
		for(Integer key : scal.keySet()) 
		{
			int r=scal.get(key).length;
			int c=scal.get(key)[0].length;
			System.out.print(key);
			System.out.println();
			for(int i=0;i<r;i++)
			{
				
				for(int j=0;j<c;j++)
				{
					System.out.print(scal.get(key)[i][j] + " ");
				}
				System.out.println();
			}
		}	
	}
	void mat_type_print()
	{
		System.out.println("Scalar");
		System.out.println("Square");
	}
}
class Identity extends Square implements check
{
	Scanner sc = new Scanner (System.in);
	private Map<Integer, int[][]> iden = new HashMap<Integer, int[][]>();
	public Identity()
	{
		super();
	}
	public Map<Integer, int[][]> getIdentity()
	{
		return getSquare();
	}
	@Override
	public int checkmat(int[][] mat, int ID)
	{
		int a=mat.length;
		int f=0;
		for (int i = 0; i < a; i++)
		{
			for (int j = 0; j < a; j++)
			{
				if(j==i && mat[i][j]!=1)
				{
					f=1;
					break;
				}
				else if(j!=i && mat[i][j]!=0)
				{
					f=1;
					break;
				}
			}
		}
		if (f == 0)
		{
			iden.put(ID,mat);
			return 1;
		}return 0;
	}
	@Override
	void createmat(int a, int b, int ID)
	{
		int [][]mat=new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(i==j)
				{
					mat[i][j]=1;
				}
				else
				{
					mat[i][j]=0;
				}
			}
		}
		iden.put(ID,mat);	
	}
	@Override
	void change(int ID)
	{
		int [][]mat=iden.get(ID);
		int r=mat.length;
		int c=mat[0].length;
		int f=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element");
				int ele=sc.nextInt();
				if(i==j)
				{
					if(ele!=1)
					{
						System.out.println("Change not possible");
						f=1;
						break;
					}
					else
						mat[i][j]=ele;
				}
				else
				{
					if(ele!=0)
					{
						System.out.println("Change not possible");
						f=1;
						break;
					}
					else
						mat[i][j]=ele;
				}

			}
		}
		if(f==0)
			iden.put(ID, mat);
		
	}
	@Override
	boolean checkid(int id)
	{
		boolean check = iden.containsKey(id);
		return check;
	}
	@Override
	public int[][] search(int ID)
	{
		return iden.get(ID);
	}
	@Override
	void display()
	{
		for(Integer key : iden.keySet()) 
		{
			int r=iden.get(key).length;
			int c=iden.get(key)[0].length;
			System.out.print(key);
			System.out.println();
			for(int i=0;i<r;i++)
			{
				
				for(int j=0;j<c;j++)
				{
					System.out.print(iden.get(key)[i][j] + " ");
				}
				System.out.println();
			}
		}	
	}
	void mat_type_print()
	{
		System.out.println("Identity");
		System.out.println("Scalar");
		System.out.println("Square");
	}
}

class Singleton extends Square implements check
{
	Scanner sc = new Scanner (System.in);
	private Map<Integer, int[][]> single = new HashMap<Integer, int[][]>();
	public Singleton()
	{
		super();
	}
	public Map<Integer, int[][]> getIdentity()
	{
		return getSquare();
	}
	@Override
	public int checkmat(int[][] mat, int id)
	{
		int a=mat.length;
		if(a==1)
		{
			single.put(id,mat);
			return 1;
		}return 0;
	}
	boolean checkid(int id)
	{
		boolean check = single.containsKey(id);
		return check;
	}
	
	@Override
	void createmat(int a, int b, int ID)
	{
		int [][]mat=new int[a][b];
		int min=1;
		int max=5;
		mat[0][0]=(int)(Math.random()*(max-min+1)+min);
		single.put(ID,mat);	
	}
	
	@Override
	void change(int ID)
	{
		int [][]mat=single.get(ID);
		
		System.out.println("Enter element");
		mat[0][0]=sc.nextInt();
		single.put(ID, mat);
		
	}
	
	@Override
	int [][] transpose(int[][] mat, int a, int b)
	{
		return mat;
	}
	
	static int Determinant(int mat[][], int a)
	{
		int det=mat[0][0];
		return det;
	}
	public int[][] search(int ID)
	{
		return single.get(ID);
	}
	
	@Override
	void display()
	{
		for(Integer key : single.keySet()) 
		{
			int r=single.get(key).length;
			int c=single.get(key)[0].length;
			System.out.print(key);
			System.out.println();
			for(int i=0;i<r;i++)
			{
				
				for(int j=0;j<c;j++)
				{
					System.out.print(single.get(key)[i][j] + " ");
				}
				System.out.println();
			}
		}	
	}
	void mat_type_print()
	{
		System.out.println("Singleton");
		System.out.println("Square");
	}
}

class Ones implements check
{
	Scanner sc = new Scanner (System.in);
	private Map<Integer, int[][]> one = new HashMap<Integer, int[][]>();
	public int checkmat(int[][] mat, int ID)
	{
		
		int a=mat.length;
		int b=mat[0].length;
		int f=0;
		for (int i = 0; i < a; i++)
		{
			for (int j = 0; j < b; j++)
			{
				if(mat[i][j]!=1)
				{
					f=1;
					break;
				}	
			}
		}
		if (f == 0)
		{
			one.put(ID,mat);
			return 1;
		}
		return 0;
		
	}
	public int createmat(int a, int b, int ID)
	{
		
		int [][]mat=new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				mat[i][j]=1;
			}
		}
		one.put(ID,mat);	
		return 0;
		
		
	}
	void change(int ID)
	{
		int [][]mat=one.get(ID);
		int r=mat.length;
		int c=mat[0].length;
		int f=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element");
				int ele=sc.nextInt();
				if(ele!=1)
				{
				
					System.out.println("Change not possible");
					f=1;
					break;
				}
				else
						mat[i][j]=ele;

			}
		}
		if(f==0)
			one.put(ID, mat);
		
	}
	boolean checkid(int id)
	{
		boolean check = one.containsKey(id);
		return check;
	}
	public int[][] search(int ID)
	{
		return one.get(ID);
	}
	void display()
	{
		for(Integer key : one.keySet()) 
		{
			int r=one.get(key).length;
			int c=one.get(key)[0].length;
			System.out.print(key);
			System.out.println();
			for(int i=0;i<r;i++)
			{
				
				for(int j=0;j<c;j++)
				{
					System.out.print(one.get(key)[i][j] + " ");
				}
				System.out.println();
			}
		}	
	}
	void mat_type_print()
	{
		System.out.println("Ones");
	}
}

class nullmat implements check
{
	Scanner sc = new Scanner (System.in);
	private Map<Integer, int[][]> zero = new HashMap<Integer, int[][]>();
	public int checkmat(int[][] mat, int ID)
	{
		int a=mat.length;
		int b=mat[0].length;
		int f=0;
		for (int i = 0; i < a; i++)
		{
			for (int j = 0; j < b; j++)
			{
				if(mat[i][j]!=0)
				{
					f=1;
					break;
				}	
			}
		}
		if (f == 0)
		{
			zero.put(ID,mat);
			return 1;
		}return 0;	
	}
	public int createmat(int a, int b, int ID)
	{
		int [][]mat=new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				mat[i][j]=0;
			}
		}
		zero.put(ID,mat);	
		return 0;
		
	}
	void change(int ID)
	{
		int [][]mat=zero.get(ID);
		int r=mat.length;
		int c=mat[0].length;
		int f=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter element");
				int ele=sc.nextInt();
				if(ele!=0)
				{
				
					System.out.println("Change not possible");
					f=1;
					break;
				}
				else
						mat[i][j]=ele;

			}
		}
		if(f==0)
			zero.put(ID, mat);
		
	}
	boolean checkid(int id)
	{
		boolean check = zero.containsKey(id);
		return check;
	}
	public int[][] search(int ID)
	{
		return zero.get(ID);
	}
	void display()
	{
		for(Integer key : zero.keySet()) 
		{
			int r=zero.get(key).length;
			int c=zero.get(key)[0].length;
			System.out.print(key);
			System.out.println();
			for(int i=0;i<r;i++)
			{
				
				for(int j=0;j<c;j++)
				{
					System.out.print(zero.get(key)[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	void mat_type_print()
	{
		System.out.println("Null");
	}
}
