package Variables_library;

public class PojoForPetStore {
	
	//declare all varibales
	
	int id;
	Object category;
	String name;
	String photoUrls;
	Object tags;
	String status;
	public PojoForPetStore(int id, Object category, String name, String purl, Object tags, String status) {
		
		this.id = id;
		this.category = category;
		this.name = name;
		this.photoUrls = purl;
		this.tags = tags;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Object getCategory() {
		return category;
	}
	public void setCategory(Object category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhotoUrls() {
		return photoUrls;
	}
	public void setPhotoUrls(String photoUrls) {
		this.photoUrls = photoUrls;
	}
	public Object getTags() {
		return tags;
	}
	public void setTags(Object tags) {
		this.tags = tags;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
