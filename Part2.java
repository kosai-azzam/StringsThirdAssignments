import edu.duke.*;
import java.io.*;
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    
    public int howManyCTG (String dna, String stringCTG) {
     
        int firstOcc = dna.indexOf(stringCTG);
        int count = 0;
        
        while (firstOcc != -1) {
            
           
            firstOcc = dna.indexOf(stringCTG, firstOcc + stringCTG.length());
            count = count + 1;
            }
            
        return count;
    }
    

    public void processGenes (StorageResource sr) {
      int countGene = 0;
      //int countCG = 0;
      //cgRatio(g) > 0.35  
        
        
          for (String g : sr.data()) {
              
              
                  
          
            
            System.out.println("Gene is " + g);
            System.out.println("the length of the gene is " + g.length());
            countGene = countGene +1;
            //countCG = countCG +1;    
            
        
        
         
            
            
        
        
      }
      System.out.println("Number of genes is " + countGene);
      System.out.println("size of storage is " + sr.size());
      
      
      //System.out.println(countCG);
    }
    
  
    public void testProcessGenes () {
     
        //FileResource fr = new FileResource("brca1line.fa");
        //String dna = fr.asString();
        //String dna = "CTGONEAtGONEcCCGGGAAAXXXYYYGGGGTAGYYCTGCCCATGENDZZZTAAONEXXXYYYZZZTAAXXxXXTWOATGTWOYYYZZZCCCATGATGENDZZZTAGTWOXXTHREEATGATGTAATHREESTOPTAGAGGGCCCCCFOURATGTAGGXXXFIVEAtgYYYFIVZZZAAAXXXFIVENDZZZTGAFIVESTOPSIXATGSIXCGGGCCGGGATCAAASIXENDTAASEVATGSIXCGGGCCGGGATCAAASEVENDENDtaAEIGSTOPTAGAGLASTONEATgtAACTG";
        String dna = "acaagtttgtacaaaaaagcagaagggccgtcaaggcccaccatgcctattggatccaaagagaggccaacattttttgaaatttttaagacacgctgcaacaaagcagatttaggaccaataagtcttaattggtttgaagaactttcttcagaagctccaccctataattctgaacctgcagaagaatctgaacataaaaacaacaattacgaaccaaacctatttaaaactccacaaaggaaaccatcttataatcagctggcttcaactccaataatattcaaagagcaagggctgactctgccgctgtaccaatctcctgtaaaagaattagataaattcaaattagacttaggaaggaatgttcccaatagtagacataaaagtcttcgcacagtgaaaactaaaatggatcaagcagatgatgtttcctgtccacttctaaattcttgtcttagtgaaagtcctgttgttctacaatgtacacatgtaacaccacaaagagataagtcagtggtatgtgggagtttgtttcatacaccaaagtttgtgaagggtcgtcagacaccaaaacatatttctgaaagtctaggagctgaggtggatcctgatatgtcttggtcaagttctttagctacaccacccacccttagttctactgtgctcatagtcagaaatgaagaagcatctgaaactgtatttcctcatgatactactgctaatgtgaaaagctatttttccaatcatgatgaaagtctgaagaaaaatgatagatttatcgcttctgtgacagacagtgaaaacacaaatcaaagagaagctgcaagtcatggatttggaaaaacatcagggaattcatttaaagtaaatagctgcaaagaccacattggaaagtcaatgccaaatgtcctagaagatgaagtatatgaaacagttgtagatacctctgaagaagatagtttttcattatgtttttctaaatgtagaacaaaaaatctacaaaaagtaagaactagcaagactaggaaaaaaattttccatgaagcaaacgctgatgaatgtgaaaaatctaaaaaccaagtgaaagaaaaatactcatttgtatctgaagtggaaccaaatgatactgatccattagattcaaatgtagcaaatcagaagccctttgagagtggaagtgacaaaatctccaaggaagttgtaccgtctttggcctgtgaatggtctcaactaaccctttcaggtctaaatggagcccagatggagaaaatacccctattgcatatttcttcatgtgaccaaaatatttcagaaaaagacctattagacacagagaacaaaagaaagaaagattttcttacttcagagaattctttgccacgtatttctagcctaccaaaatcagagaagccattaaatgaggaaacagtggtaaataagagagatgaagagcagcatcttgaatctcatacagactgcattcttgcagtaaagcaggcaatatctggaacttctccagtggcttcttcatttcagggtatcaaaaagtctatattcagaataagagaatcacctaaagagactttcaatgcaagtttttcaggtcatatgactgatccaaactttaaaaaagaaactgaagcctctgaaagtggactggaaatacatactgtttgctcacagaaggaggactccttatgtccaaatttaattgataatggaagctggccagccaccaccacacagaattctgtagctttgaagaatgcaggtttaatatccactttgaaaaagaaaacaaataagtttatttatgctatacatgatgaaacatcttataaaggaaaaaaaataccgaaagaccaaaaatcagaactaattaactgttcagcccagtttgaagcaaatgcttttgaagcaccacttacatttgcaaatgctgattcaggtttattgcattcttctgtgaaaagaagctgttcacagaatgattctgaagaaccaactttgtccttaactagctcttttgggacaattctgaggaaatgttctagaaatgaaacatgttctaataatacagtaatctctcaggatcttgattataaagaagcaaaatgtaataaggaaaaactacagttatttattaccccagaagctgattctctgtcatgcctgcaggaaggacagtgtgaaaatgatccaaaaagcaaaaaagtttcagatataaaagaagaggtcttggctgcagcatgtcacccagtacaacattcaaaagtggaatacagtgatactgactttcaatcccagaaaagtcttttatatgatcatgaaaatgccagcactcttattttaactcctacttccaaggatgttctgtcaaacctagtcatgatttctagaggcaaagaatcatacaaaatgtcagacaagctcaaaggtaacaattatgaatctgatgttgaattaaccaaaaatattcccatggaaaagaatcaagatgtatgtgctttaaatgaaaattataaaaacgttgagctgttgccacctgaaaaatacatgagagtagcatcaccttcaagaaaggtacaattcaaccaaaacacaaatctaagagtaatccaaaaaaatcaagaagaaactacttcaatttcaaaaataactgtcaatccagactctgaagaacttttctcagacaatgagaataattttgtcttccaagtagctaatgaaaggaataatcttgctttaggaaatactaaggaacttcatgaaacagacttgacttgtgtaaacgaacccattttcaagaactctaccatggttttatatggagacacaggtgataaacaagcaacccaagtgtcaattaaaaaagatttggtttatgttcttgcagaggagaacaaaaatagtgtaaagcagcatataaaaatgactctaggtcaagatttaaaatcggacatctccttgaatatagataaaataccagaaaaaaataatgattacatgaacaaatgggcaggactcttaggtccaatttcaaatcacagttttggaggtagcttcagaacagcttcaaataaggaaatcaagctctctgaacataacattaagaagagcaaaatgttcttcaaagatattgaagaacaatatcctactagtttagcttgtgttgaaattgtaaataccttggcattagataatcaaaagaaactgagcaagcctcagtcaattaatactgtatctgcacatttacagagtagtgtagttgtttctgattgtaaaaatagtcatataacccctcagatgttattttccaagcaggattttaattcaaaccataatttaacacctagccaaaaggcagaaattacagaactttctactatattagaagaatcaggaagtcagtttgaatttactcagtttagaaaaccaagctacatattgcagaagagtacatttgaagtgcctgaaaaccagatgactatcttaaagaccacttctgaggaatgcagagatgctgatcttcatgtcataatgaatgccccatcgattggtcaggtagacagcagcaagcaatttgaaggtacagttgaaattaaacggaagtttgctggcctgttgaaaaatgactgtaacaaaagtgcttctggttatttaacagatgaaaatgaagtggggtttaggggcttttattctgctcatggcacaaaactgaatgtttctactgaagctctgcaaaaagctgtgaaactgtttagtgatattgagaatattagtgaggaaacttctgcagaggtacatccaataagtttatcttcaagtaaatgtcatgattctgttgtttcaatgtttaagatagaaaatcataatgataaaactgtaagtgaaaaaaataataaatgccaactgatattacaaaataatattgaaatgactactggcacttttgttgaagaaattactgaaaattacaagagaaatactgaaaatgaagataacaaatatactgctgccagtagaaattctcataacttagaatttgatggcagtgattcaagtaaaaatgatactgtttgtattcataaagatgaaacggacttgctatttactgatcagcacaacatatgtcttaaattatctggccagtttatgaaggagggaaacactcagattaaagaagatttgtcagatttaacttttttggaagttgcgaaagctcaagaagcatgtcatggtaatacttcaaataaagaacagttaactgctactaaaacggagcaaaatataaaagattttgagacttctgatacattttttcagactgcaagtgggaaaaatattagtgtcgccaaagagtcatttaataaaattgtaaatttctttgatcagaaaccagaagaattgcataacttttccttaaattctgaattacattctgacataagaaagaacaaaatggacattctaagttatgaggaaacagacatagttaaacacaaaatactgaaagaaagtgtcccagttggtactggaaatcaactagtgaccttccagggacaacccgaacgtgatgaaaagatcaaagaacctactctattgggttttcatacagctagcgggaaaaaagttaaaattgcaaaggaatctttggacaaagtgaaaaacctttttgatgaaaaagagcaaggtactagtgaaatcaccagttttagccatcaatgggcaaagaccctaaagtacagagaggcctgtaaagaccttgaattagcatgtgagaccattgagatcacagctgccccaaagtgtaaagaaatgcagaattctctcaataatgataaaaaccttgtttctattgagactgtggtgccacctaagctcttaagtgataatttatgtagacaaactgaaaatctcaaaacatcaaaaagtatctttttgaaagttaaagtacatgaaaatgtagaaaaagaaacagcaaaaagtcctgcaacttgttacacaaatcagtccccttattcagtcattgaaaattcagccttagctttttacacaagttgtagtagaaaaacttctgtgagtcagacttcattacttgaagcaaaaaaatggcttagagaaggaatatttgatggtcaaccagaaagaataaatactgcagattatgtaggaaattatttgtatgaaaataattcaaacagtactatagctgaaaatgacaaaaatcatctctccgaaaaacaagatacttatttaagtaacagtagcatgtctaacagctattcctaccattctgatgaggtatataatgattcaggatatctctcaaaaaataaacttgattctggtattgagccagtattgaagaatgttgaagatcaaaaaaacactagtttttccaaagtaatatccaatgtaaaagatgcaaatgcatacccacaaactgtaaatgaagatatttgcgttgaggaacttgtgactagctcttcaccctgcaaaaataaaaatgcagccattaaattgtccatatctaatagtaataattttgaggtagggccacctgcatttaggatagccagtggtaaaatcgtttgtgtttcacatgaaacaattaaaaaagtgaaagacatatttacagacagtttcagtaaagtaattaaggaaaacaacgagaataaatcaaaaatttgccaaacgaaaattatggcaggttgttacgaggcattggatgattcagaggatattcttcataactctctagataatgatgaatgtagcacgcattcacataaggtttttgctgacattcagagtgaagaaattttacaacataaccaaaatatgtctggattggagaaagtttctaaaatatcaccttgtgatgttagtttggaaacttcagatatatgtaaatgtagtatagggaagcttcataagtcagtctcatctgcaaatacttgtgggatttttagcacagcaagtggaaaatctgtccaggtatcagatgcttcattacaaaacgcaagacaagtgttttctgaaatagaagatagtaccaagcaagtcttttccaaagtattgtttaaaagtaacgaacattcagaccagctcacaagagaagaaaatactgctatacgtactccagaacatttaatatcccaaaaaggcttttcatataatgtggtaaattcatctgctttctctggatttagtacagcaagtggaaagcaagtttccattttagaaagttccttacacaaagttaagggagtgttagaggaatttgatttaatcagaactgagcatagtcttcactattcacctacgtctagacaaaatgtatcaaaaatacttcctcgtgttgataagagaaacccagagcactgtgtaaactcagaaatggaaaaaacctgcagtaaagaatttaaattatcaaataacttaaatgttgaaggtggttcttcagaaaataatcactctattaaagtttctccatatctctctcaatttcaacaagacaaacaacagttggtattaggaaccaaagtgtcacttgttgagaacattcatgttttgggaaaagaacaggcttcacctaaaaacgtaaaaatggaaattggtaaaactgaaactttttctgatgttcctgtgaaaacaaatatagaagtttgttctacttactccaaagattcagaaaactactttgaaacagaagcagtagaaattgctaaagcttttatggaagatgatgaactgacagattctaaactgccaagtcatgccacacattctctttttacatgtcccgaaaatgaggaaatggttttgtcaaattcaagaattggaaaaagaagaggagagccccttatcttagtgggagaaccctcaatcaaaagaaacttattaaatgaatttgacaggataatagaaaatcaagaaaaatccttaaaggcttcaaaaagcactccagatggcacaataaaagatcgaagattgtttatgcatcatgtttctttagagccgattacctgtgtaccctttcgcacaactaaggaacgtcaagagatacagaatccaaattttaccgcacctggtcaagaatttctgtctaaatctcatttgtatgaacatctgactttggaaaaatcttcaagcaatttagcagtttcaggacatccattttatcaagtttctgctacaagaaatgaaaaaatgagacacttgattactacaggcagaccaaccaaagtctttgttccaccttttaaaactaaatcacattttcacagagttgaacagtgtgttaggaatattaacttggaggaaaacagacaaaagcaaaacattgatggacatggctctgatgatagtaaaaataagattaatgacaatgagattcatcagtttaacaaaaacaactccaatcaagcagcagctgtaactttcacaaagtgtgaagaagaacctttagatttaattacaagtcttcagaatgccagagatatacaggatatgcgaattaagaagaaacaaaggcaacgcgtctttccacagccaggcagtctgtatcttgcaaaaacatccactctgcctcgaatctctctgaaagcagcagtaggaggccaagttccctctgcgtgttctcataaacagctgtatacgtatggcgtttctaaacattgcataaaaattaacagcaaaaatgcagagtcttttcagtttcacactgaagattattttggtaaggaaagtttatggactggaaaaggaatacagttggctgatggtggatggctcataccctccaatgatggaaaggctggaaaagaagaattttatagggctctgtgtgacactccaggtgtggatccaaagcttatttctagaatttgggtttataatcactatagatggatcatatggaaactggcagctatggaatgtgcctttcctaaggaatttgctaatagatgcctaagcccagaaagggtgcttcttcaactaaaatacagatatgatacggaaattgatagaagcagaagatcggctataaaaaagataatggaaagggatgacacagctgcaaaaacacttgttctctgtgtttctgacataatttcattgagcgcaaatatatctgaaacttctagcaataaaactagtagtgcagatacccaaaaagtggccattattgaacttacagatgggtggtatgctgttaaggcccagttagatcctcccctcttagctgtcttaaagaatggcagactgacagttggtcagaagattattcttcatggagcagaactggtgggctctcctgatgcctgtacacctcttgaagccccagaatctcttatgttaaagatttctgctaacagtactcggcctgctcgctggtataccaaacttggattctttcctgaccctagaccttttcctctgcccttatcatcgcttttcagtgatggaggaaatgttggttgtgttgatgtaattattcaaagagcataccctatacagtggatggagaagacatcatctggattatacatatttcgcaatgaaagagaggaagaaaaggaagcagcaaaatatgtggaggcccaacaaaagagactagaagccttattcactaaaattcaggaggaatttgaagaacatgaagaaaacacaacaaaaccatatttaccatcacgtgcactaacaagacagcaagttcgtgctttgcaagatggtgcagagctttatgaagcagtgaagaatgcagcagacccagcttaccttgagggttatttcagtgaagagcagttaagagccttgaataatcacaggcaaatgttgaatgataagaaacaagctcagatccagttggaaattaggaaggccatggaatctgctgaacaaaaggaacaaggtttatcaagggatgtcacaaccgtgtggaagttgcgtattgtaagctattcaaaaaaagaaaaagattcagttatactgagtatttggcgtccatcatcagatttatattctctgttaacagaaggaaagagatacagaatttatcatcttgcaacttcaaaatctaaaagtaaatctgaaagagctaacatacagttagcagcgacaaaaaaaactcagtatcaacaactaccggtttcagatgaaattttatttcagatttaccagccacgggagccccttcacttcagcaaatttttagatccagactttcagccatcttgttctgaggtggacctaataggatttgtcgtttctgttgtgaaaaaaacaggacttgcccctttcgtctatttgtcagacgaatgttacaatttactggcaataaagttttggatagaccttaatgaggacattattaagcctcatatgttaattgctgcaagcaacctccagtggcgaccagaatccaaatcaggccttcttactttatttgctggagatttttctgtgttttctgctagtccaaaagagggccactttcaagagacattcaacaaaatgaaaaatactgttgagaatattgacatactttgcaatgaagcagaaaacaagcttatgcatatactgcatgcaaatgatcccaagtggtccaccccaactaaagactgtacttcagggccgtacactgctcaaatcattcctggtacaggaaacaagcttctgatgtcttctcctaattgtgagatatattatcaaagtcctttatcactttgtatggccaaaaggaagtctgtttccacacctgtctcagcccagatgacttcaaagtcttgtaaaggggagaaagagattgatgaccaaaagaactgcaaaaagagaagagccttggatttcttgagtagactgcctttacctccacctgttagtcccatttgtacatttgtttctccggctgcacagaaggcatttcagccaccaaggagttgtggcaccaaatacgaaacacccataaagaaaaaagaactgaattctcctcagatgactccatttaaaaaattcaatgaaatttctcttttggaaagtaattcaatagctgacgaagaacttgcattgataaatacccaagctcttttgtctggttcaacaggagaaaaacaatttatatctgtcagtgaatccactaggactgctcccaccagttcagaagattatctcagactgaaacgacgttgtactacatctctgatcaaagaacaggagagttcccaggccagtacggaagaatgtgagaaaaataagcaggacacaattacaactaaaaaatatatctagggcctcatgggcccagctttcttgtacaaagtggt";
        //String dna = "nonCodingDNAxxxMyGeneATGmyGenexTAAxxGeneATGTAACATGTAAATGCendTAATAAnonCodingDNAxTAGxTGA";
        //String dna = "AACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTCACCCTTCTAACTGGACTCTGACCCTGATTGTTGAGGGCTGCAAAGAGGAAGAATTTTATTTACCGTCGCTGTGGCCCCGAGTTGTCCCAAAGCGAGGTAATGCCCGCAAGGTCTGTGCTGATCAGGACGCAGCTCTGCCTTCGGGGTGCCCCTGGACTGCCCGCCCGCCCGGGTCTGTGCTGAGGAGAACGCTGCTCCGCCTCCGCGGTACTCCGGACATATGTGCAGAGAAGAACGCAGCTGCGCCCTCGCCATGCTCTGCGAGTCTCTGCTGATGAGAACACAGCTTCACTTTCGCAAAGGCGCAGCGCCGGCGCAGGCGCGGAGGGGCGCGCAGCGCCGGCGCAGGCGCGGAGGGGCGCGCCCGAACCCGAACCCTAATGCCGTCATAAGAGCCCTAGGGAGACCTTAGGGAACAAGCATTAAACTGACACTCGATTCTGTAGCCGGCTCTGCCAAGAGACATGGCGTTGCGGTGATATGAGGGCAGGGGTCATGGAAGAAAGCCTTCTGGTTTTAGACCCACAGGAAGATCTGTGACGCGCTCTTGGGTAGAGCACACGTTGCTGGGCGTGCGCTTGAAAAGAGCCTAAGAAGAGGGGGCGTCTGGAAGGAACCGCAACGCCAAGGGAGGGTGTCCAGCCTTCCCGCTTCAACACCTGGACACATTCTGGAAAGTTTCCTAAGAAAGCCAGAAAAATAATTTAAAAAAAAATCCAGAGGCCAGACGGGCTAATGGGGCTTTACTGCGACTATCTGGCTTAATCCTCCAAACAACCTTGCCATACCAGCCCATCAGTCCTCTGAGACAGGTGAAGAACCTGAGGTCGCAGGAGGACACCCAGAAGGTCCAGAGAGAGCCTCCTAGGCCCCCCACCTCCCCCCGTGGCAGCTCCAACCCCAGCTTTTTCACTAGTAAGGCAGTCGGGCCCCTGGGCCACGCCCACTCCCCCAAGCGGGGAAGGAGCTTCGCGCTGCCGCTTGGCTGGGGACTGGGCACCGCCCTCCCGCGGCTCCTGAGCCGGCTGCCACCAGGGGGCGCGCCAGCGGTGTCCGGGAGCCTAGCGGCGCGTGTGCAGCGGCCAGTGCACCTGCTCTGGCCCTCGCCGCGGTCTCTGCCAGGACCCCGACGCCCAGCCTGACCCTGCCATTCAGCGGGGCTGCGGCTCCACGGCCTGCGACAGCAGCCCCACCTGGCATTCAGCGCGCTCCCGGGGGCAGAGGTCGCGGTGTCCTCACGCTGTGGTGCCGGCCTACAACCCCCACGCCGGGCTCGGGCCCGGCGGAGGAGGGCGATGCTCCCCGGGTAGGACAAACCGGTCACCTGGGCTGCGACGGCGGCTTAGGGGCAGAAGCGGCGGTCCAGGGCCGCCTGGCGCAGCAGCCTGTCCCAGCCGCGGTCCCTGCAGTCCCTCCCTGGCGGCTGCGCAGCCGTCCCACGACAGGGGCCATAAACTCTCCAGAGCGGAAAGCCGCACCCTGGTGGCCCGGCCCCGCGCCCAGACCTGGCGGCCGCTGGCACCTGACCCGCTGCATGGGTCTCCAGGGAGCTCGCTGCCCACCCGGCGCTGCAGGCTCGGCTCCCTCGTACACTCTCTGGTAGGTGCTAGGGACGACCCTATGGGCCAGCTTGCCATGCCCAGTCCCCAGGCCGCACCCACCCTGGCTCCCTGGGCTAGGGGACTGGCTCCTCCTGTGAGTCGTGGGTCTGGGAGGCAGGGGCGTTAGGGGAGAGTGAGGGACCGAGGGCAGCCCCTGCTGTGTGCACAGCGAGGTCGTGCACAGGCGTCTGTTGCAGAGCGTGCAGCTTCAGATGAGACTGGATTGCAGGTGGAGATGACTGTGGGTGCGCACACCTGGAGGTGAAGGGGAGGCAGCCTGTCTACCTGACCCATGAAATACAGGAGACTGTACCCCAGAAGCAGCGGGTTCACTGCTCCATTGATTAAGCAAGTCTGGGACACACATGTAGCTAAGCTGTGAGTTCTGTACCAGCGATCCCAACACCCACGCCCTCAGAAAGACACTGGTGTGGGGCCTGGGTGCTTGTCAGGCCTGAAAGTGGAGAGCACGGGCCAGAGACACTGAGTAGGGGGAACCCACCCTAGGGCTCTGAGGGACGACGATGTGGGGAGCTGGTGACAGAGCCTGAGCTGGCCCAATGTTGCACGGTGGGGACAGATTCGAGGTACAGTGGGGACTGGTGACCTCAGTTCCCAGTGTCCCAGCCTGGCCTCCCAGTCCACCCAGCAATTAGTGGGTGCTGCCCTGCAAAGACTCTGGGGGTGCCTCAGCCCTCCTCATCACACGTGACTGGTGACTTCTGTGTCCACCCGCACAATAAGAGGGATCTTCTCTCACTTTCAGGCAAGCCCAAGAAAGTCAGGGGCCTATGTGAGCCAAAGAGGAGAGAAGGTGATGCCTCAGCCCAGTGTTTCTGCCCCACCTCGCTTGTGGCCTTCGGAACTTGATTTGCACCGCAGGAAAATGGGCAATGAAAACCCCTCCCTAACTGGCTTCTCAGTCCACTCTGACCAGCCCACTGCACAGCGCCCACCCTGCAGCTCCAGGTACAGAGGCTGGGATGGCTCTGGGCTGACCTAAGGGCCTTCTGATGGCTCCAACCCTCGGGATGCCTCATGCTCACCCTTTGGCACCCACCTGACAGCTCAGCATCTCTGCTCTCTGCCATCCTCAATGCCTGCTCTAGACAAGCCCAAGTCCCCCAGGAGTGGCAGAGGGAACTGAGCCGAAAACTAAGTCTCGGCTCACTGAACCCCAAGTGGGCTGTCCAGCCTCGCCCTTCAGTTCACAACCCCAGGCAGGTTCCCTCCAGGGATGTGATCCCAGGGGCCACAGCAGCACATTCTGGCCTAACCTATCCACTATTTAAACAGTTACTGAAAAGGCCAGGATGGCCGTGGGCCCTGACATTAATCCCCTTTCTCTGTGAGGGGGCTGGGTTGGGTTTGCCATCCTGATGTCTTTGTGGAAAGAGCTGGCAGGTGAAGCAAGTCTCAGGGGCCAGCCATGGGACAAGGAACCTAGGACTGGCCTCTGCTGGAACCCTCTGAGGCCCCTGCGGACAGGAGGATCCAATGGAGGTCTAGCCACCCCTCCCAGGTTGGTGCTCACAGCCCCTCCCTGGCCCACTCCCTGCACACCTGCACCTGCTGGTCTCTGGGAGAGGAGCATCCATCCATCTTGTGCGCATAGCTTTCGGCTCCATTTTCATGAGGATGGTCTCCTTGGCAGAAATGCCCATTAGGGGATCCTGAGCCTGTGCTAGCTCTTCTCTAAGTGCCAAAGCCAGTGAGAGGGACTTGAAAACTCAAGACTTATTAACAGTATTTTCTGCATTTTGTGCTTTCAGGGTTGTTTTTTCCTTAAAATGTGTAAAAACAAACATTGAGATTTCTATCTTTTATATAATTTGGATTCTGTTATCACACGGACTTTTCCTGAAATTTATTTTTATGTATGTATATCAAACATTGAATTTCTGTTTTCTTCTTTACTGGAATTGTTAACTGTTTTATAGGCCAAATCTTTTAAAAAAAACACATCTCTCTAATTTCTCTAAACATTTCTAATTACATATATATTTACTATACCTAATACACTACTTTGGAATTCCTTGAGGCCTAAATGCATCGGGGTGCTCTGGTTTTGTTGTTGTTATTTCTGAATGACATTTACTTTGGTGCTCTTTATTTTGCGTATTTAAAACTATTAGATCGTGTGATTATATTTGACAGGTCTTAATTGACGCGCTGTTCAGCCCTTTGAGTTCGGTTGAGTTTTGGGTTGGAGAATTTTCTTCCACAAGGGATTGTCTTGGATTTTTCTGTTTCTCCCTCAATATCCACCTGGAAAACATTTCAATTAATTTATATTTACTTAAATATTTCTGTGCAAAAACTGTGTACAAAAGCCCCAAAGCATAATTTGTGCAGTTGAGCGCATGTTCTGTTGTTCAGCATTTATGGTGGTTGGTAGTGGAAAAGATTTTTAGAATATGTGGATTTTCGGGATATTCCCAGAAGCCCAGATAGCGACACTTTACCTTTGGAGGAATTACTTCTCAGAATATTGCACACAATCAATCGCCTTTGGAAGGAGCATATATCCCCAGCAAAAGCTCTGGTTTTTTGAAGTCTGTATTGTGTGTTACTTCCAGGAGAATATGCAATGATGACAATGTTATTAGATGATTCAAATATGAAGTGCTGTTATGCCAAACAATGAATCTTTGTGTTATACATTATGCCTAACTATAAATCTTTGTGTTATACATTTTAATGTCATTGGAGAGTACTCCTGTCTTCTTGGCATTATTGATAATTAGATTCTAATTGCTAATAAGTCAGAAAAATTAGGAACACCAAATTTCAGTTGTCTCAAAAGCACTCCTCTTATTAAATTTGGATGTTTACCTTTATCACATCAAAAGAAATATTGTTAGAAAGGTGTTTAATGTTTTGCAGATGGATAGATTACTGTTATTAGTTCTCATTTCATTGTTAATTTTTAAAACCATAAGGTTGGAAGTATCAATATGCCTTTCAATATACCTTAGTGGAATTTATTAAATTTTCATGGATGTCCTTTAGGGGGTTCAGGAAGTTATTTCTATTGCTAGATTTCTGGAAGATTTATCAGGAATGAGTGTCAGACATTGTCAGACGTCCATTGAAATCATCATGGTCTTTTCCTTTATTCTATTAATATGATGTATTACACTGATTGATTTTTAAATTTGTATTGGTAGGATAATTCCACTTGGTTATATTGTCTAACTTTTTTCTAATTTTCTTTCATTTTTATTACAGATGAGGCCTCACTCTGTCACCCAGGTTGGGGTGGAGTGGCACAGTCACAGCTCACTATAACCTCAAGCTCCTGGGCTCAAGTGATCCTGCCACCTCAGCCTCCTAAGTAGCTGGAACTACAGATGTGCACTGCCATGCCAGGCTTGTCTAACATTTTTATGTGTTGCTTCATCCAGTTTGCTAGAGTTTTTGGAGATTTCTGTCTTCATTCATGAGGGATAATAGTCTGCACTTTTATTTTCTTGTGATACTTTTGTCTGATTTGTTATCTGGGTAATACTGGCCTTGAAAATGAATTGATGTTTTCCTGCTTCTCTGCTTTGCAAGTGTTTGTGAAGGATTGGTTATTCATTAAGTGTTTAATAGAATTCACTAGTGAAGCTATGTGAGCCAGGGCTAGACTGATGAAGAGTTTTCATTAGTCTAATCTGTTTACTTGCTGTATAAGTACGCATATATTCTCTTTCTTCTTGATTTAATTTTACACTTTGTGTATAGCAGGGAATCTGTGTCTAATTTGTAGTATTTCATGCTTCTAGGTTTTCATGGCAGTTGAGATGTAAGAATAACAATAATGTTGGGAGAAGGAAGTTGTGGACAATCCATGAATATCCCAACATCTGTTGTAGGAAGGTTAAGATTACTTTTTTTTTTTTTGCTGTACTGAACTGAATACTCTTATTTATAATGTCAGACAAATGTAATGTTGTATATAAATAGAACTAGGAAAATGTGCCATTTGTCTTAGTATTTAATCAAGATGGAAGTCTGGGCCTACCTCCTCTCTTTTATTAATATGTAGACAGGACACCAACACAAATTAGAATGAAGACAAACAAAATGTTAGCAAATGAAGAATGGTATCAATTGGTTAAAATGTGATGAAATAGAGTGGTGAATATTTACATAGAATCCATGATGTGTTAGGTGCTATTTCAAGCTATTTGCACATATAGTTTTAATACCAATGACGTTAAAATGTATAACACAAAGATTCATATAAATAAAAATTACAACATTGTAAATAATATTAGGTGACACTAAAACTGTCATAGAAATACACATTTATATAAAACATAAAGTAACATGAAGTATTAAATTTTAGAAACTTTGATTACTAATCAGATGAACAACTGATTAGCCTTTTTATCCAGTAAAAAAGGCATACATATTATTTTCAAATTCCAGAGACAAATATTTTAAATATTGAAGTTGAAGACCTAAAAATGTGTCACTGACCTCATGGAAGTAGATATTCACTAGGTGATATTTTCTAGGCTCTCTGAAATTATATCAGAAAAATGTGAATTAGAATATAACCCATAAATAATATCTGGCCACATACAAAGTAATTGAAGATCAATTTAAATGGCTATTGGATTAAGAAATAGGGACTGAGGTAAATTTGCAGTGTCAGGGAGGATCTAAGGAGGAAGCATTGACACTGGAGCCCAAGGACCTGGGATCACAGAACAGATTCTACCAGTGCTAACTTACTGCTCCACAGAAAACATCAATTCTGCTCATGCGCAGGTACAATTCATCAAGAAAGGAATTACAACTTCAGAAATGTGTTCAAAATATATCCATACTTTGACATATTAATGAAGTAATCACATTCTACACATAACTACTCCATATGGAATACTGGGGAGGAGGTGTTCCAAATAAAGAGACTGAGGATTTCTCATGAGAACTCAGTGTCTGCTAGAAAATATCTAAGTAAAATATTTTACTTATGTGGAAAGTGTGGATGTTTGTGCATCAAAAGTTTCAAGAATCCCTAAAATTTACAATGGAGATGAGGAGAAAATATCAGAATTTCCCAGCACCAGAAATAAGGCAAGAAAAAATTCAGAGGGGTTGTAAATGTGAAAAGCCAATGGCTGGTCACACAGCAACATTGATAACCTTGTGCCTGGACAACTAGAATAAATACATAAACATACACATTGAAAATATTTCCAATATTAGATCTCCCTCATGTGAGAACTAAATTATAAAGATTGAAGCATAGAAGAAAATAAGCTACCAGAATAAATTTGATTACACATAAATTTCTGATATTGAAACTGTCACAAATGTTTAAGTTGGTAGTGGAAGACAAAGGACATATAATCTTGGGAGTCCTAAGGCCCTGCCCACTGCCAGTCCCTCCACACTACTACAGCTGATGCTTTCTGGAAATCACCACCTCCTGGCAGGAGCCCAACCAGCACAAATATAGAGCATTAAACCACCAAAGCTAAGGAGGCTCACAGAGTCTATTGCACCCTTCACCACCTCCACTGGAACAGGCGCTGGTATCCATGGCTCAGAGACCCAAAGATGGTTCACATCACAGGGCTCTATGCAGACAACCCCCAGTACCAGCCCAAAGCCACGTAGACCTGCTGGGTGGCTAGACCCAGAAGAGAGACAACAATCAATGCACTTTGGCTTACAGGAAGCCATGCCCATAGGAAAAAGGGGAGAGTACTACGTCAAGGGAACACCCCGTGGGATGAAAGAGTCTGAACAACAGTCTTCAGCCCTAGACCTTTCCTCTGACAGAGTCTACCAAAATGAGAAGGAACCAGAAAACCAACCCTGGTAATCTGACAAAACAAGAATCTTCAACACCCCCCAAAAAATCACACCAGTTCATCACCAATGGATCCAAACAAAGAAGAAATCACTGATTCATCTAAAAAAAAATTCAGGTTAGTTATTAAGCTAATCAGGGAGGGGCCAGAGAAAGATGAAGCCCAATGCAAGAAAATCCAAAAAATGATACAATACGTGAAGGGAGAATTATTCAAGGAAATAGATAGCTTAAATAAAAAAATAAAAAATCAGGAAACTTTGGACGTACTTTTAGAAATGTGAAATGCTCTGGAAAGTCTCAGCAATAGAATTGAACAAGTAGAAGAAAGAAATTCAGAATTCGAAGACAAGGTCTTTGATTTAACCCAATCCAATAAAGACAAAGAAAAAAGAATAAGAAAATATGAGCAAAGTCTCCAAGGAGTCTGGCATTCTGTTAAATGATGAAACCTAACACTAATTGGTGTACCTGAGGAAGAAGTGAATTCTAAAAGCCAGGAAAACATATTTGGGAGAATAATCTAGGAAAACTTCCATGGCCTTGTGAGAGACCTAGACATCCAAATACAAGAACCACAAATAACACCTGGGAAATTCATCACAAAAAGATCTTAGCCTAGGCACATTGTCATTAGGTTATCCAAAGTTAAGACAAAGGAAAGAATCTTAAGAGCTGTGAGACAGAAGCACTAGGTAACCTATAAAGGAAAACCTGTCAAATTAACAGCAGATTTCACAGCAGGAACCTTACAAGCTAGATGGGATTGGGGCCCTTTCTTCAGCCTCCTCAAACAAAACAATTATCAGCCAAGAATTTTGTATCCAGCAAAACTAAACATCATATATGAAGGAAAGATACAGTCATTTTCAGACAAACAAATGCTGACAGAATTTGCCATTACCAAGCCAGGACTCTAAGAACTGCTAAAAGGAGCTCTAAATCATGAAACAAATCCTGGAAACACATCAAAACAGAACTTCATTAACGCATAAATCACACAGGACCTATAAAACAAAAATACAAGTTAAAAAACAAAAACAAAGTACAGAGGCAACAAAGAGCATGATGAAAGCAATGGTACCTCACTTTTTAATACTAATGTTGGTTGTAAATGGCTTAAATGCTCCACTTACAAGATACAGAACCACAGAATGGATAACAACTCACCAACTAACTATCTGCTGCCTTCAGGAGACTCACCTAACACATAACGACTTACATAAACTTAAGGAAAGTGGTAGAAAAAGGCATTTCATGCAAATGGACACCAAAAGCAAGCAGCAGTAACTATTCTCATATGAGACAAAACAAACTTTAAAGCAACAGTAGCTAAAAGAGACAAAGAGAGACAGTATATCATCTGTCACCTGACAGTCTCATCCAACAGAAAAATATGACAATCCTAAACATATGTGAACCTAACACTGGAGCTCCCAAATTTATAAAACAATTACTAGTAGACATAAGAAATAAGATAGACAGCAACACAATAATAGTGGGGGACTTCAATACTCCACTGACAGCACTAGACAGGTCATCAAGACAGAAAGTCAACAAAGAAACAATGGATTTAAACTATACTTTGGAACAAATGGACTTAACAGATATATATAGAACATTTCATCCAACAACCACAGAATACACATTCTATTCAACAGCACATGGAATTTTCTCCAAGATAGACCATATGATAGGCCATAAAATGAGTCTCAATAAATTTAAGAAAATTGAAATTGTATCACGCACTCTCTCACATCACAATGGAATAAAACTGAAAATCAACTCCAAAAGGAATCTTCGAAACCATGCAAATACATGGAAATTAAATAACCTGCTCCTGAATGAGCATTGGGTGAAAAACGAAATCAAGATGGAAATGTAAAAAATTTCTTCGAACTGGATGACACAACCTATCAAGACCTCTGGGATACAGCAAAGGCAGTGCTAAGAGGAAAGTTTATAGCACTAAACACCTACGTCGAAAAGTCTGAAAGAGCACAGACAATCTAAGTTCACATCTCAGGGAACTAGAGAAGGAGGAACAAGCCAAACCCAATCCCAGCAAACAAAGGAAATAACCAAGATCAGAGCAGAACTAAATGAAATTGACACAACAACAACAACAACAAAAATACAAAACATAAATAAAACAAAAATTTGGTTATTTGAAAAGATA";
        //String DNA = dna.toUpperCase();
        
        StorageResource genes = getAllGenes(dna);
        
        System.out.println(dna);
        System.out.println(genes.size());
        processGenes(genes);
    }
    
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
    
       public StorageResource getAllGenes (String dna) {
    
        int startIndex = 0;
        StorageResource geneList = new StorageResource();
        while ( true) {
         
            String currGene = findGene(dna, startIndex);
            
            if (currGene.isEmpty()) {
             
              break; 
            
             
        }
         
             geneList.add(currGene);
             startIndex = dna.indexOf(currGene, startIndex) + currGene.length();
           
           
            
        }
        return geneList;
     }
    
    public String findGene (String dna, int where) {
     
        int startIndex = dna.indexOf("atg", where);
        if (startIndex == -1) {
         
            return "";
    }
        
        int indexTAA = findStopCodon(dna, startIndex, "taa");
        int indexTAG = findStopCodon(dna, startIndex, "tag");
        int indexTGA = findStopCodon(dna, startIndex, "tga");
        
        int temp = Math.min(indexTAA, indexTAG);
        int minIndex = Math.min(temp, indexTGA);
        if (minIndex != -1) {
            
        return dna.substring(startIndex, minIndex + 3);
    }
    else {
        
        return "";
    }
    }
    
    
    public int findStopCodon (String dna, int startIndex, String stopCodon) {
     
        int currIndex = dna.indexOf(stopCodon, startIndex + 3);
        while ( currIndex != -1) {
            if ((currIndex - startIndex) % 3 == 0) {
             
                return currIndex;
            }
            else {
                
                currIndex = dna.indexOf(stopCodon, currIndex + 1);
            }
        }
        return dna.length();
    }

}