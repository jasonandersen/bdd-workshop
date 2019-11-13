package feature.movie;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExpirementalSteps {
	
	@Given("this data is passed in:")
	public void this_data_is_passed_in(io.cucumber.datatable.DataTable dataTable) {
		System.out.println(dataTable.toString());
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	}

	@When("the scenario is run")
	public void the_scenario_is_run() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("a data table is passed in to my step definitions")
	public void a_data_table_is_passed_in_to_my_step_definitions() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
