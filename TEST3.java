/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.StorageResource;
import edu.duke.FileResource;
public class TEST3 {
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
   
 public StorageResource  getAllGenes(String dna) {
     StorageResource geneList= new StorageResource();
     int startIndex=0;
     while(true){
     String currentGene= findGene(dna,startIndex);
       if(currentGene.isEmpty()){
            break;
        }
        geneList.add(currentGene);
      startIndex=dna.indexOf(currentGene,startIndex)+ currentGene.length();
    }
    return geneList;
    } 
    
    
    public void processGenes(StorageResource sr){
        
        for(String s: sr.data()){
 
         System.out.println(s);   
              
        }
    }
    
 public void testOn() {
     FileResource fr = new FileResource("brca1line.fa");
     String dna = fr.asString();
     System.out.println(dna);
     StorageResource sr = getAllGenes(dna);
     processGenes(sr);
    
    
    
    
    
    }   
}
