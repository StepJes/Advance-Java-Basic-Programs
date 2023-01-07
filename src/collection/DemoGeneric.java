package collection;

public class DemoGeneric {
	class MyGenericClass<T> {
		T obj;

		void add(T obj) {
			this.obj = obj;
		}

		T get() {
			return obj;
		}
	}

	class GenMain {
		public void main(String[] args) {
			MyGenericClass<Integer> m_int = new MyGenericClass<Integer>();
			m_int.add(32);

			MyGenericClass<String> m_str = new MyGenericClass<String>();
			m_str.add("Yo");

			MyGenericClass<Double> m_double = new MyGenericClass<Double>();
			m_double.add(32.8);

			System.out.println("Integer: " + m_int.get());
			System.out.println("String: " + m_str.get());
			System.out.println("Double: " + m_double.get());

		}
	}
}
