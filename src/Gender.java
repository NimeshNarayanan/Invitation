/**
 * Created by nimeshp on 07/03/16.
 */
public enum Gender {
    MALE {
            @Override
            public String title(){

                return "Mr ";
            }
        },
        FEMALE {
            @Override
            public String title(){

                return "Ms ";
            }
        };
        public String title() {
            return "";
        }
}
