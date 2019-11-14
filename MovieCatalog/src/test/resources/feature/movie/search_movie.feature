Feature: Movie Search
	In order to improve catalog usability and customer satisfaction
	As a movie enthusiast
	I want to search movie titles in the catalog by keyword
	
	Scenario Outline: Search movies by title
		Given a movie with the title 'Inside Out', produced by 'Pixar', released 19 June 2015
		And a movie with the title 'Out of Africa', produced by 'Universal Pictures', released 20 December 1985
		And a movie with the title 'Avatar', produced by '20th Century Fox', released 18 December 2009
		When the customer searches for movies with the keyword '<keyword>'
		Then <movieCount> movies should have been found
		And the catalog should have 3 total movies
		
		Examples:
		| keyword | movieCount |
		| out     | 2          |
		| Africa  | 1          |
		| Inside  | 1          |
		| Monkey  | 0          |
		
	Scenario: Search movies by order
		Given a movie with the title 'Inside Out', produced by 'Pixar', released 19 June 2015
		And a movie with the title 'Out of Africa', produced by 'Universal Pictures', released 20 December 1985
		And a movie with the title 'Avatar', produced by '20th Century Fox', released 18 December 2009
		When the customer searches for the third movie
		Then 1 movie should have been found
		And the movie title should be 'Avatar'
		
	Scenario: Testing data tables
		Given this data is passed in:
			| col1		| col2 		| col3		|
			| r1c1		| r1c2		| r1c3		|
			| r2c1		| r2c2		| r2c3		|
			| r3c1		| r3c2		| r3c3		|
		When the scenario is run
		Then a data table is passed in to my step definitions