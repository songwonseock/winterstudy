//package anno.valid;
//
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//
//public class CheckCaseValidator implements ConstraintValidator<CheckCase, String> {
//
//    private CaseMode caseMode;
//
//    public void initialize(CheckCase constraintAnnotation) {
//        this.caseMode = constraintAnnotation.value();
//    }
//
//    public boolean isValid(String object, ConstraintValidatorContext constraintContext) {
//
//        if (object == null)
//            return true;
//        
//        boolean isValid;
//        if (caseMode == CaseMode.NUMBER) {
//            isValid = (Integer.parseInt(object) == 100);
//        }
//        else {
//            isValid = "hello".equals(object);
//        }
//        
//        if(!isValid) {
//        	System.out.println("invalid format===");
//            constraintContext.disableDefaultConstraintViolation();
//            constraintContext.buildConstraintViolationWithTemplate( "{com.mycompany.constraints.CheckCase.message}"  ).addConstraintViolation();
//        }
//        return isValid;
//    }
//
//}