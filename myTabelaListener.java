import java.util.*;
import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;

public class myTabelaListener extends TabelaBaseListener {
	protected static String target = "java.stg";
	protected STGroup allTemplates;
	protected ST module;
	protected int varCount = 0;
	protected ParseTreeProperty<String> varNode = new ParseTreeProperty<>();
	protected ParseTreeProperty<ST> statsNode = new ParseTreeProperty<>();


	public boolean generated() {
		return module != null;
	}

	public void codeGen(String name) {
		 assert name != null && !name.isEmpty();
		 assert generated();

		 String filename = name+"."+target.split("\\.")[0];
		 try
		 {
			 	System.out.print(name);
				module.add("name", name);
				PrintWriter pw = new PrintWriter(new File(filename));
				pw.print(module.render());
				pw.close();
		 }
		 catch(IOException e)
		 {
				System.err.println("ERROR: unable to write in file "+filename);
				System.exit(0);
		 }
	}


	@Override public void enterProgram(TabelaParser.ProgramContext ctx) {
			  allTemplates = new STGroupFile(target);
	}

	@Override public void exitProgram(TabelaParser.ProgramContext ctx) {
			module = allTemplates.getInstanceOf("module");
			module.add("stat", statsNode.get(ctx.statList()).render());
	}

	@Override public void exitStatList(TabelaParser.StatListContext ctx) {
      ST st = allTemplates.getInstanceOf("stats");
      statsNode.put(ctx, st);
      Iterator<TabelaParser.StatContext> iter = ctx.stat().iterator();
      while(iter.hasNext()) {
         st.add("stat", statsNode.get(iter.next()).render());
       }
 }
	@Override public void exitStat(TabelaParser.StatContext ctx) {
		if (ctx.printTable() != null)
			 statsNode.put(ctx, statsNode.get(ctx.printTable()));
		else if (ctx.newTable() != null)
			 statsNode.put(ctx, statsNode.get(ctx.newTable()));
		else if (ctx.saveFile() != null)
			statsNode.put(ctx, statsNode.get(ctx.saveFile()));
		else if (ctx.removeColumn() != null)
			statsNode.put(ctx, statsNode.get(ctx.removeColumn()));
		else if (ctx.removeLine() != null)
			statsNode.put(ctx, statsNode.get(ctx.removeLine()));
		else if (ctx.addColumn() != null)
			statsNode.put(ctx, statsNode.get(ctx.addColumn()));
		else if (ctx.addLine() != null)
			statsNode.put(ctx, statsNode.get(ctx.addLine()));
		else if (ctx.equals() != null)
			statsNode.put(ctx, statsNode.get(ctx.equals()));
		else if (ctx.getColumn() != null)
			statsNode.put(ctx, statsNode.get(ctx.getColumn()));
		else if (ctx.getLine() != null)
			statsNode.put(ctx, statsNode.get(ctx.getLine()));
		else if (ctx.read() != null)
			statsNode.put(ctx, statsNode.get(ctx.read()));
		else if (ctx.sum() != null)
			statsNode.put(ctx, statsNode.get(ctx.sum()));
 }
  @Override public void exitRead(TabelaParser.ReadContext ctx) {
				ST st = allTemplates.getInstanceOf("read");
				statsNode.put(ctx, st);
				st.add("stat", "");
				st.add("e1", ctx.e1.getText());
				st.add("e2", ctx.e2.getText());
	}
	@Override public void exitNewTable(TabelaParser.NewTableContext ctx) {
			ST st = allTemplates.getInstanceOf("newTabela");
			statsNode.put(ctx, st);
			st.add("stat", "");
			st.add("e1", ctx.e1.getText());
			st.add("e2", ctx.e3.getText());
			st.add("e3", ctx.e3.getText());

	}
	@Override public void exitSaveFile(TabelaParser.SaveFileContext ctx) {
				ST st = allTemplates.getInstanceOf("saveFile");
				statsNode.put(ctx, st);
				st.add("stat", "");
				st.add("e1", ctx.e1.getText());
				st.add("e2", ctx.e2.getText());

 }
	@Override public void exitRemoveColumn(TabelaParser.RemoveColumnContext ctx) {
		ST st = allTemplates.getInstanceOf("removeColumn");
		statsNode.put(ctx, st);
		st.add("stat", "");
		st.add("e1", ctx.e1.getText());
		st.add("e2", ctx.e2.getText());

	}
	@Override public void exitRemoveLine(TabelaParser.RemoveLineContext ctx) {
		ST st = allTemplates.getInstanceOf("removeLine");
		statsNode.put(ctx, st);
		st.add("stat", "");
		st.add("e1", ctx.e1.getText());
		st.add("e2", ctx.e2.getText());
	}
	@Override public void exitAddColumn(TabelaParser.AddColumnContext ctx) {
		ST st = allTemplates.getInstanceOf("addColumn");
		statsNode.put(ctx, st);
		st.add("stat", "");
		st.add("e1", ctx.e1.getText());
		st.add("e2", ctx.e2.getText());
	}
	@Override public void exitAddLine(TabelaParser.AddLineContext ctx) {
		 ST st = allTemplates.getInstanceOf("addLine");
		 statsNode.put(ctx, st);
		 st.add("stat", "");
		 st.add("e1", ctx.e1.getText());
	}
	@Override public void exitPrintTable(TabelaParser.PrintTableContext ctx) {
			  ST st = allTemplates.getInstanceOf("printTable");
				statsNode.put(ctx, st);
				st.add("stat", "");
				st.add("expr", ctx.e1.getText());
	}
	@Override public void exitEquals(TabelaParser.EqualsContext ctx) {
				ST st = allTemplates.getInstanceOf("equals");
				statsNode.put(ctx, st);
				st.add("stat", "");
				st.add("e1", ctx.e1.getText());
				st.add("e2", ctx.e2.getText());
	}
	@Override public void exitSum(TabelaParser.SumContext ctx) {
		ST st = allTemplates.getInstanceOf("sum");
		statsNode.put(ctx, st);
		st.add("stat", "");
		st.add("e1", ctx.e1.getText());
		st.add("e2", ctx.e2.getText());
		st.add("e3", ctx.e3.getText());
	}
	@Override public void exitGetColumn(TabelaParser.GetColumnContext ctx) {
		ST st = allTemplates.getInstanceOf("getColumn");
		statsNode.put(ctx, st);
		st.add("stat", "");
		st.add("e1", ctx.e1.getText());
		st.add("e2", ctx.e2.getText());
	}

	@Override public void exitGetLine(TabelaParser.GetLineContext ctx) {
		ST st = allTemplates.getInstanceOf("getLine");
		statsNode.put(ctx, st);
		st.add("stat", "");
		st.add("e1", ctx.e1.getText());
		st.add("e2", ctx.e2.getText());
	}
}
