package ExcerciciosPG79;


public class GradeBookMoficado 
{
private String courseName; //nome do curso para esse GradeBook4
private String instrutor; //nome do professor para esse GradeBookModificado
	
	//o construtor inicializa courseName com o argumento String
	public GradeBookMoficado(String name , String pro)
	{
		courseName = name; //inicializa courseName
		instrutor = pro; //inicializa instrutor
	}//fim do construtor.
	
	
	//metodo para configurar o nome do curso
	public void setCourseName(String name)
	{
		courseName = name; //armazena o nome do curso
	}//fim do mentodo set
	
	
	//metodo para recuperar o nome do curso
	public String getCourseName()
	{
		return courseName ;
	}//fim do metodo get
	
	
	//metodo para configurar o nome do instrutor
	public void setInstrutor(String pro)
	{
		instrutor = pro;// armazen o nome do instrutor.
	}//fim do metodo set
	
	
	//metodo para recuperar o nome do instrutor
	public String getInstrutor()
	{
		return instrutor;
	} //fim do medoto get
	
	
	//exibe uma mensagem de boas-vindas para o usuario GradeBook
	public void displayMessage()
	{
		//essa construçao chama getcourseName para obter o
		//nome do curso e nome do instrutor que esse GradeBook representa.
		System.out.printf( "Welcome to the GradeBook for \n%S! \nThis course is Presented by:%s\n" , 
				getCourseName() ,getInstrutor() );
	}//fim do medoto displayMessage

}
