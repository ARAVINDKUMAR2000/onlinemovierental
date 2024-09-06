//Name:Aravindkumar S
//Date:05.09.2024
//CapstoneProject:API testing of Movie rental management endpoints, using restassured with cucumber

package stepdefinitions;

public class ClassPrgm {

}

class User {
 private String username;
 private String password;
 private String email;

 public User() {
     
 }

 public User(String username, String password, String email) {
     this.username = username;
     this.password = password;
     this.email = email;
 }

 
 public String getUsername() {
     return username;
 }

 public void setUsername(String username) {
     this.username = username;
 }

 public String getPassword() {
     return password;
 }

 public void setPassword(String password) {
     this.password = password;
 }

 public String getEmail() {
     return email;
 }

 public void setEmail(String email) {
     this.email = email;
 }
}

class Movie {
 private String title;
 private String director;
 private String genre;
 private String releaseDate;

 public Movie() {
   
 }

 public Movie(String title, String director, String genre, String releaseDate) {
     this.title = title;
     this.director = director;
     this.genre = genre;
     this.releaseDate = releaseDate;
 }


 public String getTitle() {
     return title;
 }

 public void setTitle(String title) {
     this.title = title;
 }

 public String getDirector() {
     return director;
 }

 public void setDirector(String director) {
     this.director = director;
 }

 public String getGenre() {
     return genre;
 }

 public void setGenre(String genre) {
     this.genre = genre;
 }

 public String getReleaseDate() {
     return releaseDate;
 }

 public void setReleaseDate(String releaseDate) {
     this.releaseDate = releaseDate;
 }
}

class Rental {
 private int userId;
 private int movieId;
 private String rentalDate;

 public Rental() {
     
 }

 public Rental(int userId, int movieId, String rentalDate) {
     this.userId = userId;
     this.movieId = movieId;
     this.rentalDate = rentalDate;
 }

 
 public int getUserId() {
     return userId;
 }

 public void setUserId(int userId) {
     this.userId = userId;
 }

 public int getMovieId() {
     return movieId;
 }

 public void setMovieId(int movieId) {
     this.movieId = movieId;
 }

 public String getRentalDate() {
     return rentalDate;
 }

 public void setRentalDate(String rentalDate) {
     this.rentalDate = rentalDate;
 }
}
