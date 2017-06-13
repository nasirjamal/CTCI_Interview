package Chapter1;

public class Ch1_5 {

	public boolean editDis(char[] a,char[] b){
		
		int aLen = a.length;
		int bLen = b.length;
		int max;
		if(aLen>bLen){
			max = aLen;
		}else{
			max = bLen;
		}
		int editDistance=0;
		for(int i=0,j=0;i<max;){
			
			i = i>aLen? i--:i;
			j = j>bLen? j--:j;
			
			if(a[i]==b[j]){
				i++;
				j++;
			}else if(aLen>bLen){
				i++;
				editDistance++;
			} else if(aLen<bLen){
				j++;
				editDistance++;
			}else {
				i++;
				j++;
				editDistance++;
			}
			
			
			
		}
		
		
		if(editDistance==1){
			return true;
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		
		Ch1_5 s = new Ch1_5();
		
		char a[] = {'p','a','l','e'};
		char b[] = {'l'};
		System.out.println(s.editDis(a, b));
	}

}
