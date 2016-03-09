public class SelectionSorter
{

	static void sort(Comparable[] array)
		{
			int smallindex;

			for (int i = 0; i < array.length; i++)
				{
					smallindex = i;
					for (int j = i + 1; j < array.length; j++)
						{
							if (array[j].compareTo(array[smallindex]) < 0)
								smallindex = j;
						}
					if (smallindex != i)
						swap(array, smallindex, i);
				}
		}

	static void swap(Object[] array, int index1, int index2)
		{
			Object temp = array[index1];
			array[index1] = array[index2];
			array[index2] = temp;
		}
}