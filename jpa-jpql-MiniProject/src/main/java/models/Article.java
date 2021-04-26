package models;

import javax.persistence.*;

@Entity
@Table(name="Article")
public class Article {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codearticle;
	private String designation;
	private int prix;
	private int stock;
	@ManyToOne
	@JoinColumn(name="categorie")
	private String categorie;
	private String photo;
	

	public Article() {
		super();
	}

	public int getCodearticle() {
		return codearticle;
	}

	public void setCodearticle(int codearticle) {
		this.codearticle = codearticle;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	
}
