public class Subject implements Comparable<Subject>
{
        
        private int id;
        private String name;
        private int year;
        
        public Subject(int id, String name, int year) {
            this.id = id;
            this.name = name;
            this.year = year;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Subject [id=" + id + ", name=" + name + ", year=" + year + "]";
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int compareTo(Subject o)
        {
            if(this.id < o.id)
            {
                return -1;
            }
            else if(this.id > o.id)
            {
                return 1;
            }
            else
            {
                return 0;
            }

            // return this.name.compareTo(o.name);     
        }
    }

