package Hirademy.Assistants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/assistant")
public class AssistantController {

    @Autowired
    private AssistantRepository assistantRepository;

    @PostMapping
    public Long createAssistant(@RequestBody Assistant assistant) {
        assistantRepository.save(assistant);
        return assistant.getId();
    }

    @GetMapping("/{assistantId}")
    public Assistant getAssistantById(@PathVariable Long assistantId) {
        return assistantRepository.findById(assistantId).orElse(null);
    }

    @PutMapping("/{assistantId}")
    public Assistant updateAssistant(@PathVariable Long assistantId, @RequestBody Assistant assistantDetails) {
        Assistant assistant = assistantRepository.findById(assistantId).orElse(null);
        if (assistant != null) {
            assistant.setName(assistantDetails.getName());
            assistant.setMobile(assistantDetails.getMobile());
            assistant.setEmail(assistantDetails.getEmail());
            assistant.setSalary(assistantDetails.getSalary());
            assistant.setCity(assistantDetails.getCity());
            assistant.setCountry(assistantDetails.getCountry());
            assistant.setDepartment(assistantDetails.getDepartment());
            assistant.setRole(assistantDetails.getRole());
            return assistantRepository.save(assistant);
        }
        return null;
    }

    @DeleteMapping("/{assistantId}")
    public void deleteAssistant(@PathVariable Long assistantId) {
        assistantRepository.deleteById(assistantId);
    }
}
