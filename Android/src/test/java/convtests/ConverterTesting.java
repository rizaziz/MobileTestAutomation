package convtests;

import common.Base;
import convpageobject.MainPageModel;
import org.testng.annotations.Test;

/**
 * Created by admin on 9/13/16.
 */
public class ConverterTesting extends Base {


    @Test
    public void getText(){

        MainPageModel model=new MainPageModel(ad);

      /*  model.adv1.click();

        model.btnTemp.click();

        model.adv2.click();

        Assert.assertEquals(Double.parseDouble(model.display.getText()), 33.800, 1);
*/

    }

}
