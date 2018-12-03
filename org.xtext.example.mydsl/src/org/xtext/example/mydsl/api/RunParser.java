package org.xtext.example.mydsl.api;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.myDsl.Solid;

import com.google.inject.Injector;

public class RunParser {
	private final static Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	
	private URI fileURI;
	
//	private SYNC sync;
	
	public RunParser(String filePath) throws IOException {
		fileURI = URI.createFileURI(filePath);
	}
	
	public Optional<Solid> parse() {
		// Obtain a resource set from the injector
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

		// Load a resource by URI, in this case from the file system
		Resource resource = resourceSet.getResource(fileURI, true);
		// Validation
		IResourceValidator validator = ((XtextResource) resource).getResourceServiceProvider().getResourceValidator();
		List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		for (Issue issue : issues) {
			System.err.println(issue.getMessage());
		}

		if (issues.isEmpty())
			return Optional.of((Solid) resource.getContents().get(0));
		
		return Optional.empty();
	}
	
//	public static void main(String[] args) throws IOException {		
//		RunParser parser = new RunParser("test.stl");
//		parser.loadSTLFile("test.stl");
//	}
//	
//	
//	public void loadSTLFile(String filePath) throws IOException {
//		RunParser parser = new RunParser(filePath);
//		Optional<Solid> solid = parser.parse();
//
//		solid.ifPresent(b -> {
//			try {
//				initialiseFwdSynchroniser();
//
//				sync.getSourceResource().getContents().add(b);
//				System.out.println(sync.getSourceResource().getContents());
//			
//				sync.forward();
//				
//				Metamodell.Solid solid2 = (Metamodell.Solid) sync.getTargetResource().getContents().get(0);
//				System.out.println(solid2.getFacets().get(0).getEdges().get(0).getA());
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		});
//	}
//
//	
//	private void initialiseFwdSynchroniser() throws IOException {
//		if (sync != null)
//			sync.terminate();
//
//		sync = new SYNC_App();
//	}
//
//	private void initialiseBwdSynchroniser() throws IOException {
//		if (sync == null)
//			sync = new SYNC_App();
//	}
}
