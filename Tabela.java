import java.nio.file.*;
import java.util.*;
import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Tabela{
  static Scanner sc = new Scanner(System.in);
  private int colunas = 0;
  private int linhas = 0;
  private String [][] tabela;

  public Tabela(String a[][], int l, int c){
      tabela = a;
      colunas = c;
      linhas = l;
  }

  public Tabela(String s){
    String temp = "";
    try
    {
      Path p = Paths.get(s);
      temp = new String(Files.readAllBytes(p));
      ANTLRInputStream input = new ANTLRInputStream(temp);
      CSVerifyLexer lexer = new CSVerifyLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      CSVerifyParser parser = new CSVerifyParser(tokens);
      ParseTree tree = parser.program();
    } catch(IOException e) {
			System.err.println("ERROR: unable to write in file "+s);
			System.exit(0);
    }
    String [] aux = temp.split("\n");
    String [] aux2 = aux[0].split(",");
    colunas = aux2.length;
    linhas = aux.length;
    tabela = new String [linhas][colunas];
    for(int i=0; i<linhas; i++){
     aux2 = aux[i].split(",");
      for(int j=0; j<colunas ; j++){
          tabela[i][j] = aux2[j];
      }
    }
  }

  public Tabela(int linhas, int colunas){
    if(colunas == 0){
      System.err.println("ERROR: invalid number of columns");
      System.exit(1);
    }
    if(linhas == 0){
      System.err.println("ERROR: invalid number of lines");
      System.exit(1);
    }
    System.out.println();
    System.out.println("-- Nova Tabela --");
    int aux = 0;
    tabela = new String [linhas+1][colunas+1];
    this.colunas = colunas+1;
    this.linhas = linhas+1;
    for(int i=0; i<this.linhas; i++){
      for(int j=0; j<this.colunas; j++){
        if(i==0){
          aux = j+1;
          System.out.print("Cabeçalho da coluna " + aux + ": ");
          tabela[i][j] = sc.nextLine();
        }else{
          System.out.print("Linha " + i + "  Coluna " + tabela[0][j] + "  ");
          tabela[i][j] = sc.nextLine();
        }
      }
    }
  }

  public void getColumn(int x){
    if(x<=0 || x>colunas){
      System.err.println("ERROR: invalid value to column");
      System.exit(1);
    }
    System.out.println();
    System.out.println("-- Devolvendo a coluna número " + x + " --");
    for(int i= 0 ; i< linhas ; i++ ){
      System.out.println(tabela[i][x-1]);
    }
  }

  public void getLine(int y){
    if(y<0 || y>linhas-1){
      System.err.println("ERROR: invalid value to line");
      System.exit(1);
    }
    for(int i= 0 ; i< colunas ; i++ ){
      System.out.print(tabela[y][i] + " , ");
    }
    System.out.println("");
  }

  public void removeColumn(int x){
    if(x<=0 || x>colunas){
      System.err.println("ERROR: invalid value to collumn");
      System.exit(1);
    }
<<<<<<< HEAD
      String [][] aux = new String [linhas][colunas-1];
        for(int i=0; i<linhas; i++){
          for(int j=0; j<colunas; j++){
            if(j < x-1){
                aux[i][j] = tabela[i][j];
            }
            if(j > x-1){
                aux[i][j-1] = tabela[i][j];
            }
          }
=======
    System.out.println();
    System.out.println("-- Removendo a coluna " + x + " --");
    String [][] aux = new String [linhas][colunas-1];
    for(int i=0; i<linhas; i++){
      for(int j=0; j<colunas; j++){
        if(j < x-1){
            aux[i][j] = tabela[i][j];
        }
        if(j > x-1){
            aux[i][j-1] = tabela[i][j];
>>>>>>> 84c42b4098d939051e73d7f4e83691fc3d8750b5
        }
      }
    }
    colunas--;
    tabela =  new String [linhas][colunas];
    tabela = aux;
    System.out.println("Removida com sucesso!");
  }

  public void addColumn(String s) {
    System.out.println();
    System.out.println("-- Adicionar coluna " + s + " --");
    colunas++;
    String [][] aux = new String [linhas][colunas-1];
    aux=tabela;
    tabela = new String [linhas][colunas];
    tabela[0][colunas-1] = s;
    for(int i=0; i<linhas; i++){
        for(int j=0; j<colunas-1; j++){
            tabela[i][j] = aux[i][j];
        }
    }
    for(int i = 1; i < linhas; i++) {
      System.out.println("Elemento na linha " + i + " ?");
      tabela[i][colunas-1] = sc.nextLine();
    }
  }

  public void addLine() {
    System.out.println();
    System.out.println("-- Adicionar uma nova linha --");
    linhas++;
    String [][] aux = new String [linhas-1][colunas];
    aux = tabela;
    tabela = new String [linhas][colunas];
    for(int i=0; i<linhas-1; i++){
        for(int j=0; j<colunas; j++){
            tabela[i][j] = aux[i][j];
        }
      }
    for(int i = 0; i < colunas; i++) {
      System.out.println("Elemento na coluna " + tabela[0][i] + " ?");
      tabela[linhas-1][i] = sc.nextLine();
    }
  }

  public void removeLine(int y){
    System.out.println();
    System.out.println("-- Removendo linha " + y + " --");
    if(y<0 || y>linhas-1){
      System.err.println("ERROR: invalid value to line");
      System.exit(1);
    }
    if(y==0 ){
      System.err.println("ERROR: you cant remove line 0 (header)");
      System.exit(1);
    }
    String [][] aux = new String [linhas-1][colunas];
    for(int i=0; i<linhas; i++){
      if(i < y){
        for(int j=0; j<colunas; j++){
            aux[i][j] = tabela[i][j];
        }
      }
      if(i > y){
        for(int j=0; j<colunas; j++){
            aux[i-1][j] = tabela[i][j];
        }
      }
    }
    linhas--;
    tabela =  new String [linhas][colunas];
    tabela = aux;
  }

  public void printTable() {
    System.out.println();
    System.out.println("Tabela: ");
    for(int i = 0; i < linhas; i++) {
      for(int j = 0; j < colunas; j++) {
        System.out.print(tabela[i][j] + ",");
      }
      System.out.println();
    }
  }

  @Override
  public String toString(){
    String s="";
    for(int i=0; i<linhas; i++){
      for(int j=0; j<colunas; j++){
          s = s + tabela[j][i];
            s=s+",";
      }
      s=s+"\n";
    }
    return s;
  }

  public String [][] getTabela(){
    return tabela;
  }

  public int getLinesSize(){
    return linhas;
  }

  public int getCollumnSize(){
    return colunas;
  }

  public Tabela sum(Tabela a){
    String [][] aux = new String [a.getLinesSize()][a.getCollumnSize()+this.getCollumnSize()];
    String [][] aux2 = a.getTabela();
    String [][] aux3 = this.getTabela();
    int c = a.getCollumnSize()+this.getCollumnSize() -1;
    if(this.getLinesSize() != a.getLinesSize()){
      	System.err.println("ERROR: tables have different line sizes");
        System.exit(1);
    }else{
      for(int i=0; i<a.getLinesSize();i++){
        for(int j=0;j<this.getCollumnSize();j++){
          aux[i][j] = aux3[i][j];
        }
        for(int j= a.getCollumnSize()-1; j>=0; j--){
          aux[i][c] = aux2[i][j];
          c--;
        }
        c = a.getCollumnSize()+this.getCollumnSize() -1;
      }
    }
    return new Tabela(aux, a.getLinesSize(), a.getCollumnSize()+this.getCollumnSize());
  }

  public void saveFile(String s) {
    try {
      System.out.println();
			PrintWriter pw = new PrintWriter(new File(s));
      for(int i = 0; i < linhas; i++) {
        for(int j = 0; j < colunas; j++) {
            pw.print(tabela[i][j] + ",");
        }
        pw.println();
      }
			pw.close();
      System.out.println("Guardado no ficheiro com sucesso!");
	  } catch(IOException e) {
			System.err.println("ERROR: unable to write in file "+s );
			System.exit(0);
	  }
  }
}
