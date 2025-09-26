public class HelloApp{
	public static void main(String[] args){
	if(args.length >0 && args[0].equals("fail")){
	System.out.println("Failure Scenario triggered!");
}
else{
System.out.println("Success Scenario triggered!");
}
}
}
