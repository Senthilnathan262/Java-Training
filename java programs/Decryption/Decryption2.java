class Decryption2{
	public static void main(String []args){
		String str=args[0];
		int l=str.length();
		for(int i=1;i<l;i=i+2){
			char tempchar=str.charAt(i);
			int temp=tempchar-'0';
			for(int j=0;j<temp;j++){
				System.out.print(str.charAt(i-1));
			}
			

		}
	}
}