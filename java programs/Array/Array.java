class Array{
	public static void main(String []args){
		int []a=new int[10];
		int[] b=new int[10];
		int c[]=new int[10];
		int j=0;
		for(int i=0;i<10;i++){
			a[i]=j;
			b[i]=j;
			c[i]=j;
			++j;
		}
		System.out.println("Array a:");
			
		for(int i=0;i<10;i++){
			
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Array b:");
		for(int i=0;i<10;i++){
			
			
			System.out.print(b[i]+" ");
		}
		
		System.out.println();
		System.out.println("Array c:");
			
		for(int i=0;i<10;i++){
			
			System.out.print(c[i]+" ");
		}
		//multiple arrays in 1 line
		int[] a1={4,5,6},a2={1,2,3};
		for(int i:a1){
			System.out.println(i);
		}
		for(int i:a2){
			System.out.println(i);
		}
		
		
	}
}