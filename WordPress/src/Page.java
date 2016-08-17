import java.time.LocalDate;
import java.util.ArrayList;


public class Page {

	 private String title;
	 private String body;
	 private LocalDate date;
	 private String category;
	 
	 public Page(String title,String body,String category){
		 this.title=title;
		 this.body=body;
		 this.date=LocalDate.now();
		 this.category=category;
	 }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	 
}
