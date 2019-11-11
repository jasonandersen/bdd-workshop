package feature.movie;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.app.movie.Catalog;
import com.mycompany.app.movie.Movie;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Cucumber steps to automate movie catalog searching test scenarios.	
 */
public class MovieSearchSteps {
	
	private Catalog catalog = new Catalog();
	private List<Movie> resultList = new ArrayList<Movie>();

	@Given("a movie with the title '(.+)', produced by '(.+)', released (.+)$")
	public void addNewMovie(String title, String producedBy, String released) throws ParseException {
		Movie movie = new Movie(title, producedBy, new SimpleDateFormat("dd MMMMM yyyy").parse(released));
		catalog.addMovie(movie);
	}

	@When("the customer searches for movies with the keyword '(.+)'")
	public void setSearchParameters(String keyword) {
		resultList = catalog.findMovieByKeyword(keyword);
	}

	@When("the customer searches for the third movie")
	public void setOrdinalSearchParameters() {
		resultList = catalog.findMovieByOrder(2);
	}

	@Then("(\\d+) movies? should have been found")
	public void verifyQuantityOfMoviesFound(int quantity) {
		assertThat(resultList.size(), equalTo(quantity));
	}

	@Then("the catalog should have (\\d+) total movies")
	public void verifyCatalogSize(int numMovies) {
		assertThat(catalog.getSize(), equalTo(numMovies));
	}

	@Then("the movie title should be 'Avatar'")
	public void verifyMovieTitle() {
		assertThat(resultList.get(0).getTitle(), equalTo("Avatar"));
	}

}