package sm.model;

import java.util.List;

/**
 * Created by YangKang on 2017/9/7.
 */
public class AdvHomeSectionForm extends AdvHomeSection {

    private List<AdvContent> advList;

    public List<AdvContent> getAdvList() {
        return advList;
    }

    public void setAdvList(List<AdvContent> advList) {
        this.advList = advList;
    }
}
