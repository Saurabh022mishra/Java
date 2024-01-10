public class str {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        String str3=new String("hello");
        System.out.println(str1.equals(str2));
        Boolean result=str1==str2?true:false;
        System.out.println(result);
        System.out.println(str3.equals(str2));
        Boolean result1=str3==str2?true:false;
        System.out.println(result1);

    }
    
}
