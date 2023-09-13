class ExceptionExampal{
	public static void main(String[]args){
		try{
			System.out.println(9/0);
				}
		catch (Exception e){
			System.out.println(e);
		System.out.println(e.getMessage());
		e.printStackTrace();
}
finally{System.out.println("Program is successfully Executed");
}
}}