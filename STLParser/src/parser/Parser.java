package parser;

import java.io.IOException;
import java.util.Optional;


import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.stlimportexport.SYNC_App;
import org.xtext.example.mydsl.api.RunParser;
import org.xtext.example.mydsl.myDsl.Solid;

public class Parser {

	private static SYNC sync;
	
	private static void initialiseFwdSynchroniser() throws IOException {
		if (sync != null)
			sync.terminate();

		sync = new SYNC_App();
	}

	private void initialiseBwdSynchroniser() throws IOException {
		if (sync == null)
			sync = new SYNC_App();
	}

	public static void main(String[] args) throws IOException {
		RunParser stlParser = new RunParser("test.stl");
		Optional<Solid> s = stlParser.parse();
		

		s.ifPresent(b -> {
			try {
				initialiseFwdSynchroniser();

				sync.getSourceResource().getContents().add(b);
				//System.out.println(sync.getSourceResource().getContents());
				
				sync.forward();
				//System.out.println(sync.getTargetResource().getContents());
				sync.saveModels();
				
				Metamodell.Solid solid = (Metamodell.Solid) sync.getTargetResource().getContents().get(0);
				System.out.println(solid.getFacets().get(0).getEdges().get(0).getA());
				System.out.println(solid.getFacets().get(0).getEdges().get(0).getB());
				System.out.println(solid.getFacets().get(0).getEdges().get(1).getA());
				System.out.println(solid.getFacets().get(0).getEdges().get(1).getB());
				System.out.println(solid.getFacets().get(0).getEdges().get(2).getA());
				System.out.println(solid.getFacets().get(0).getEdges().get(2).getB());
			
				System.out.println(solid.getFacets().get(0).getEdges().get(0).getF());
				System.out.println(solid.getFacets().get(0).getEdges().get(1).getF());
				System.out.println(solid.getFacets().get(0).getEdges().get(2).getF());
				
				System.out.println(solid.getFacets().get(1).getEdges().get(0).getF());
				System.out.println(solid.getFacets().get(1).getEdges().get(1).getF());
				System.out.println(solid.getFacets().get(1).getEdges().get(2).getF());
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
}
