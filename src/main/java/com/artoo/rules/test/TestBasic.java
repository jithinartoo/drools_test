package com.artoo.rules.test;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import com.artoo.rules.model.ApplicationView;
import com.artoo.rules.model.Score;
import com.artoo.rules.util.Constants;
import com.artoo.rules.util.KnowledgeSessionHelper;
import com.artoo.rules.util.Out;

public class TestBasic {
	public static void main(String[] args) {
		KieContainer kieContainer = KnowledgeSessionHelper.createRuleBase();
		KieSession sessionStateFull = KnowledgeSessionHelper.getStateFulKnowledgeSession(kieContainer,
				"defaultStateFullKieSession");

		Out out = new Out();
		sessionStateFull.setGlobal("out", out);

		Score score = new Score();
		sessionStateFull.setGlobal("score", score);

		ApplicationView ai = new ApplicationView();
		ai.setPerson_applicant_occupation_code(Constants.OCCUPATION_SELF_EMPLOYED);
		ai.setPerson_applicant_present_home_address_years(Constants.ADDRESS_YEARS_MEDIUM);
		ai.setBusiness_age(7);
		ai.setLoan_type("hyl_1");
		ai.setCollateral_asset_age(4);
		ai.setCollateral_asset_type(Constants.COLLATERAL_ASSET_BUILDING);
		ai.setAsset_status(Constants.PROPERTY_TYPE_COMMERCIAL_PROP_SELF_OCCUPIED);
		ai.setPerson_applicant_years_of_experience(10);

		FactHandle handle = sessionStateFull.insert(ai);
		sessionStateFull.fireAllRules();

	}
}
