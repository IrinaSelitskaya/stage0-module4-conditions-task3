package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
     symbol=65;
     if(symbol>=0 && symbol<=127){
      System.out.println("English");} 
     else{
      System.out.println("Non English");} 
}
}
