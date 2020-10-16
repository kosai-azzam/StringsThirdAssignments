import edu.duke.*;
/**
 * Write a description of test5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test5 {
    
      public int howManyC (String dna, String stringc) {
     
        int firstOcc = dna.indexOf(stringc);
        int count = 0;
        
        while (firstOcc != -1) {
            
           
            firstOcc = dna.indexOf(stringc, firstOcc + stringc.length());
            count = count + 1;
            }
            
        return count;
    } 
    
    public int howManyG (String dna, String stringg) {
     
        int firstOcc = dna.indexOf(stringg);
        int count = 0;
        
        while (firstOcc != -1) {
            
           
            firstOcc = dna.indexOf(stringg, firstOcc + stringg.length());
            count = count + 1;
            }
            
        return count;
    } 
    
    public double cgRatio (String dna) {
     
        double dnaString = dna.length();
        double ratio = (howManyC(dna, "C") + howManyG(dna, "G")) / dnaString; 
        return ratio;
    }
    
    public int findStopCodon(String dna,int startIndex,String stopCodon){
     int currIndex=dna.indexOf(stopCodon,startIndex+3);
     while(currIndex!=-1){
        int diff=currIndex-startIndex;
           if(diff % 3==0){
             return currIndex;
           }
           
             else {
            currIndex=dna.indexOf(stopCodon,currIndex+1);
             }
     }
     return -1;
 } 


     public String findGene(String dna,int start){
    int startIndex=dna.indexOf("ATG",start);
        if(startIndex==-1){
        return "";
        }
    int taaIndex=findStopCodon(dna,startIndex,"TAA");
    int tagIndex=findStopCodon(dna,startIndex,"TAG");
    int tgaIndex=findStopCodon(dna,startIndex,"TGA");
    int minIndex=0;
    if(taaIndex==-1||
      (tagIndex !=-1 && tagIndex < taaIndex)){
       minIndex=tagIndex;
        }
          else{
            minIndex= taaIndex;   
            }
 if(minIndex==-1||
      (tgaIndex !=-1 && tgaIndex < minIndex)){
       minIndex=tgaIndex;
        }
if (minIndex==-1){
            return "";   
            }
    return dna.substring(startIndex,minIndex+3);
    }
    
    public void  processGenes( String sr){
   // Declaring the variables
   int countgene=0;
   int countGenesLonger9=0;
   double  cgRatio=0.00;
   int countNumberOfcgRatio=0;
   int lengthOfLongestGene=0;
   String currentString=" ";
   String dna=" ";
   
   // creating a storageResource object geneList
   StorageResource stringList = new StorageResource();
   // set startIndex to 0
   int startIndex=0;
   
   while(true){
       // Finding the next string after startIndex
       String newString=findGene(dna,startIndex);
       // if no string found, break
       if(newString.isEmpty()){
        break;
        }
        //Adding string to stringList
        stringList.add(newString);
       
       for(String curstring : stringList.data()){
           //finding and counting the Strings in sr that are longer than 9 characters
        if(curstring.length()>9){
        System.out.println(curstring);
        countGenesLonger9++;
        System.out.println(countGenesLonger9);
        }
        // calling the cgRatio method
        double curcgratio=cgRatio(curstring);
        if(curcgratio>0.35){
        countNumberOfcgRatio++;
        System.out.println(countNumberOfcgRatio);
        }
        String longestString=" ";
        if(curstring.length()>longestString.length()){
        longestString=curstring;
        System.out.println(longestString.length());
        }
        }
              
   //Setting startIndex to just past the end of the gene
   startIndex=dna.indexOf(currentString, startIndex) + currentString.length();
}

}
  public void testProcessGenes1(){
    //Declaring a StorageResource object sr
    StorageResource resource = new StorageResource() ;
    //adding DNA string that has some genes longer than 9 characters
    resource.add("AATGCGTAATATGGTCCTGTTCTAGTTCTGATA");
    //adding DNA string that has no genes longer than 9 characters
    resource.add("ATGCTAA");
    //adding DNA string that has some genes whose C-G-ratio is higher than 0.35
    resource.add("ATCCTAGTAAGTAGCTATAGC");
    //adding DNA string that has some genes whose C-G-ratio is lower than 0.35. 
    resource.add("ACCTAATGATTCCTAATTATA");
    // adding DNA String dna5="ATGATCATAAGAAGATAATAGAGGGCCATGTAA";
    resource.add("ATGATCATAAGAAGATAATAGAGGGCCATGTAA");
    for(String s1:resource.data()){
     processGenes(s1);
    
    }
}
 public void testProcessGenes2(){
    FileResource fr = new FileResource();
     String genes = fr.asString();
     StorageResource sr =new StorageResource();
     for(String s2: sr.data()){
         processGenes(s2);
        }
      
    
    }

}
