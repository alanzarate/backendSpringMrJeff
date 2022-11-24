package bo.ucb.edu.backendSpringMrJeff.dto;

import bo.ucb.edu.backendSpringMrJeff.entity.model.OperationInfoModel;

import java.util.List;

public class OperationInfoResDto {
     List<OperationInfoModel> availableOperations;
     List<OperationInfoModel> currentOperations;

    public List<OperationInfoModel> getCurrentOperations() {
        return currentOperations;
    }

    public void setCurrentOperations(List<OperationInfoModel> currentOperations) {
        this.currentOperations = currentOperations;
    }

    public List<OperationInfoModel> getAvailableOperations() {
        return availableOperations;
    }

    public void setAvailableOperations(List<OperationInfoModel> availableOperations) {
        this.availableOperations = availableOperations;
    }
}
