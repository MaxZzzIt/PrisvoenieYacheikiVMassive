package by.home.maxzzzit;

public class PrisvoenieYacheikiVMassive {

	public static void main(String[] args) {
		String []name= {"Vasya","Yla","Mila","Katya","Maksim","Nastya"};
		for(int s=0; s<=5; s++) {
			name[s]="Petuya";// присвоение в цикле ко всем
			name[0]="Vasya";// присвоение в цикле к одной ячейке
			System.out.println(name[s]);
		}


	}

}
