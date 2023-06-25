public class remove_duplicate {
    public static StringBuilder removeDuplicate(String s,StringBuilder sb,Boolean arr[],int index){
        if(index==s.length()){
            return sb;
        }
        if(!arr[((int)s.charAt(index))-97]){
            sb.append(s.charAt(index));
            arr[((int)s.charAt(index))-97]=true;
        }
        return removeDuplicate(s, sb, arr, index+1);
    }
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("");
        Boolean[] arr=new Boolean[26];
        for(int i=0;i<26;i++){
            arr[i]=false;
        }
System.out.println(removeDuplicate("appnnacollege",sb,arr,0));
        // System.out.println((int)'a');
    }
}
