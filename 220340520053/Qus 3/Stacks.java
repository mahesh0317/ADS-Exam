class Stacks
{
  int [] arr;
  int size;
  int t1,t2;
  
  Stacks(int n)
  {
   size = n;
   arr=new int [n];
   t1=n/2+1;
   t2=n/2;
  }
void push1(int a)
{
  if(t1>0)
  {
   t1--;
   arr[t1]=a;
  }
  else
  {
    System.out.println("Overflow"+"by"+a+"\n");
	return;
  }

}
void push2(int a)
{
  if(t2<size-1)
  {
  t2++;
  arr[t2]=a;
  }
  else
  {
  System.out.println("Overflow"+"by"+a+"\n");
  return;
  }
  
}

 void pop1()
  {
    if(t1<=size/2)
	{
	int  a= arr[t1];
	t1++;
	return a;
	
	}
    else
	{
	System.out.println("underflow");
	
	}
	return 0;
  }

  void pop2()
  {
    if(t2>=size/2+1)
	{
	int  a= arr[t2];
	t2++;
	return a;
	
	}
    else
	{
	System.out.println("underflow");
	
	}
	return 1;
  }
    public static void main (String []args)
	{
	
	Stacks ref= new Stacks(5);
	ref.push1(5);
	ref.push2(10);
	ref.push2(15);
	ref.push1(11);
	ref.push2(7);
	//ref.push2(40);
	System.out.println("poped form stack1"+ref.pop1()+" ");
	ref.push2(40);
	System.out.println("poped from stack2"+ref.pop2()+" ");
	
	}
	
	
}