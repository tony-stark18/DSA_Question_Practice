
class Solution
{
	String convertToRoman(int n) {
		int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String romans[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<values.length;i++){
		    while(values[i]<=n){
		        StringBuilder t=new StringBuilder(romans[i]);
		        sb.append(t);
		        n=n-values[i];
		    }
		}
		return sb.toString();
	}
}
