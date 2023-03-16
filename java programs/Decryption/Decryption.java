class Decryption{
	public static void main(String []args){
		String str=args[0];
		int l=str.length();
		for(int i=1;i<l;i=i+2){
			String tempstr=String.valueOf(str.charAt(i));
			int temp=Integer.parseInt(tempstr);
			for(int j=0;j<temp;j++){
				System.out.print(str.charAt(i-1));
			}
			

		}
	}
}