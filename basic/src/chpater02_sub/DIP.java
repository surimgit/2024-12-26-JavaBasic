package chpater02_sub;

// 의존성 역전의 원칙
class Controller {
	Service service;
	Controller(Service service) {
		this.service = service;
	}
	
	void controllerMethod() {
		System.out.println("controller A");
		service.serviceMethod();
	}
	void controllerMethod2() {
		System.out.println("controller A2");
		service.serviceMethod2();
	}
}

class Service {
	
	InterfaceRepository repository;
	Service(InterfaceRepository repository) {
		this.repository = repository;
	}
	
	void serviceMethod() {
		System.out.println("Service A");
		repository.repositoryMethod();
	}
	void serviceMethod2() {
		System.out.println("Service A2");
		repository.repositoryMethod2();
	}
}

interface InterfaceRepository{
	void repositoryMethod();
	void repositoryMethod2();
}

class Repository implements InterfaceRepository{
	public void repositoryMethod() {
		System.out.println("Repository A");
	}
	public void repositoryMethod2() {
		System.out.println("Repository A2");
	}
}

class Repository2 implements InterfaceRepository{
	public void repositoryMethod() {
		System.out.println("Repository B");
	}
	public void repositoryMethod2() {
		System.out.println("Repository A2");
	}
}

public class DIP {
	public static void main(String[] args) {
		Repository repository = new Repository();
		Repository2 repository2 = new Repository2();
		InterfaceRepository interfaceRepository = repository;
		Service service = new Service(repository);
		Controller controller = new Controller(service);
		controller.controllerMethod();
	}
}