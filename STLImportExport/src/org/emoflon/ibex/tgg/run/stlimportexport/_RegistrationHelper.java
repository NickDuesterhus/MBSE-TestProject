package org.emoflon.ibex.tgg.run.stlimportexport;

import Metamodell.impl.MetamodellPackageImpl;
import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.stlimportexport.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) throws IOException {
		// Replace to register generated code or handle other URI-related requirements
		//_SchemaBasedAutoRegistration.register(strategy);
		MetamodellPackageImpl.init();		
		MyDslPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/org.xtext.example.mydsl/model/generated/MyDsl.ecore", MyDslPackage.eINSTANCE);
	}

	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("STLImportExport");
		options.projectPath("STLImportExport");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
