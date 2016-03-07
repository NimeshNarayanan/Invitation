/**
 * Created by nimeshp on 07/03/16.
 */
public enum Gender {
    Male {
            @Override
            public String title(){

                return "Mr ";
            }
        },
        Female {
            @Override
            public String title(){

                return "Ms ";
            }
        };
        public String title() {
            return "";
        }
}
