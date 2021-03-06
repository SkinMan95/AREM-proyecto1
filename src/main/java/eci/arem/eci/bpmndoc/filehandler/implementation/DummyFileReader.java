package eci.arem.eci.bpmndoc.filehandler.implementation;

import eci.arem.eci.bpmndoc.filehandler.FileException;
import eci.arem.eci.bpmndoc.filehandler.AbstractFileReader;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public class DummyFileReader implements AbstractFileReader {

    @Override
    public String getText(String filename) throws FileException {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                + "<model:definitions xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:bonitaConnector=\"http://www.bonitasoft.org/studio/connector/definition/6.0\" xmlns:dc=\"http://www.omg.org/spec/DD/20100524/DC\" xmlns:di=\"http://www.omg.org/spec/BPMN/20100524/DI\" xmlns:di_1=\"http://www.omg.org/spec/DD/20100524/DI\" xmlns:java=\"http://jcp.org/en/jsr/detail?id=270\" xmlns:model=\"http://www.omg.org/spec/BPMN/20100524/MODEL\" xsi:schemaLocation=\"schemaLocation http://www.omg.org/spec/BPMN/20100524/MODEL schemas/BPMN20.xsd\" exporter=\"BonitaSoft\" exporterVersion=\"7.6.0\" expressionLanguage=\"http://groovy.apache.org/\" targetNamespace=\"http://bonitasoft.com/_VglSIBAREeiptuDNTChZDg\">\n"
                + "  <model:collaboration id=\"_VglSIBAREeiptuDNTChZDg\">\n"
                + "    <model:participant id=\"_ps3ooBA6EeiptuDNTChZDg\" name=\"Proceso de negocio\" processRef=\"_VglSIRAREeiptuDNTChZDg\"/>\n"
                + "    <model:participant id=\"_VglSRRAREeiptuDNTChZDg\" name=\"Employee actor\">\n"
                + "      <model:documentation>This is an example of actor that is mapped to any ACME users</model:documentation>\n"
                + "    </model:participant>\n"
                + "    <model:participant id=\"_ps76EBA6EeiptuDNTChZDg\" name=\"Proceso de negocio 2\" processRef=\"_DQ6VgBA5EeiptuDNTChZDg\"/>\n"
                + "  </model:collaboration>\n"
                + "  <model:process id=\"_VglSIRAREeiptuDNTChZDg\" name=\"Proceso de negocio\">\n"
                + "    <model:ioSpecification id=\"_ps3ooRA6EeiptuDNTChZDg\">\n"
                + "      <model:inputSet id=\"_ps3oohA6EeiptuDNTChZDg\"/>\n"
                + "      <model:outputSet id=\"_ps3ooxA6EeiptuDNTChZDg\"/>\n"
                + "    </model:ioSpecification>\n"
                + "    <model:laneSet id=\"Proceso de negocio_laneSet\">\n"
                + "      <model:lane id=\"_VglSIhAREeiptuDNTChZDg\" name=\"Empleado\">\n"
                + "        <model:documentation>Piscina del empleado</model:documentation>\n"
                + "        <model:flowNodeRef>_VglSIxAREeiptuDNTChZDg</model:flowNodeRef>\n"
                + "        <model:flowNodeRef>_YBxcgBAREeiptuDNTChZDg</model:flowNodeRef>\n"
                + "        <model:flowNodeRef>_ay-_4BAREeiptuDNTChZDg</model:flowNodeRef>\n"
                + "        <model:flowNodeRef>_d1txEBAREeiptuDNTChZDg</model:flowNodeRef>\n"
                + "      </model:lane>\n"
                + "    </model:laneSet>\n"
                + "    <model:startEvent id=\"_VglSIxAREeiptuDNTChZDg\" name=\"Inicio\"/>\n"
                + "    <model:endEvent id=\"_YBxcgBAREeiptuDNTChZDg\" name=\"Fin\"/>\n"
                + "    <model:task id=\"_ay-_4BAREeiptuDNTChZDg\" name=\"Actividad 1\">\n"
                + "      <model:documentation>Descripcion 1</model:documentation>\n"
                + "    </model:task>\n"
                + "    <model:userTask id=\"_d1txEBAREeiptuDNTChZDg\" name=\"Actividad 2\">\n"
                + "      <model:documentation>Actividad Humana</model:documentation>\n"
                + "    </model:userTask>\n"
                + "    <model:sequenceFlow id=\"_VglSQhAREeiptuDNTChZDg\" name=\"\" sourceRef=\"_VglSIxAREeiptuDNTChZDg\" targetRef=\"_ay-_4BAREeiptuDNTChZDg\"/>\n"
                + "    <model:sequenceFlow id=\"_ckA4oBAREeiptuDNTChZDg\" name=\"\" sourceRef=\"_ay-_4BAREeiptuDNTChZDg\" targetRef=\"_d1txEBAREeiptuDNTChZDg\"/>\n"
                + "    <model:sequenceFlow id=\"_f3IPMBAREeiptuDNTChZDg\" name=\"\" sourceRef=\"_d1txEBAREeiptuDNTChZDg\" targetRef=\"_YBxcgBAREeiptuDNTChZDg\"/>\n"
                + "  </model:process>\n"
                + "  <model:process id=\"_DQ6VgBA5EeiptuDNTChZDg\" name=\"Proceso de negocio 2\">\n"
                + "    <model:ioSpecification id=\"_ps8hIBA6EeiptuDNTChZDg\">\n"
                + "      <model:inputSet id=\"_ps8hIRA6EeiptuDNTChZDg\"/>\n"
                + "      <model:outputSet id=\"_ps8hIhA6EeiptuDNTChZDg\"/>\n"
                + "    </model:ioSpecification>\n"
                + "    <model:laneSet id=\"Proceso de negocio 2_laneSet\">\n"
                + "      <model:lane id=\"_GCAkIBA5EeiptuDNTChZDg\" name=\"Empleado proceso 2\">\n"
                + "        <model:documentation>Descripcion del empleado del proceso 2</model:documentation>\n"
                + "        <model:flowNodeRef>_MnzzcBA5EeiptuDNTChZDg</model:flowNodeRef>\n"
                + "        <model:flowNodeRef>_TZRgMBA5EeiptuDNTChZDg</model:flowNodeRef>\n"
                + "        <model:flowNodeRef>_aKR58BA5EeiptuDNTChZDg</model:flowNodeRef>\n"
                + "        <model:flowNodeRef>_fsXpgBA5EeiptuDNTChZDg</model:flowNodeRef>\n"
                + "        <model:flowNodeRef>_pQiHYBA5EeiptuDNTChZDg</model:flowNodeRef>\n"
                + "        <model:flowNodeRef>_pjgGsBA5EeiptuDNTChZDg</model:flowNodeRef>\n"
                + "        <model:flowNodeRef>_qlmc4BA5EeiptuDNTChZDg</model:flowNodeRef>\n"
                + "        <model:flowNodeRef>_01cVABA5EeiptuDNTChZDg</model:flowNodeRef>\n"
                + "        <model:flowNodeRef>_U4go4BA6EeiptuDNTChZDg</model:flowNodeRef>\n"
                + "        <model:flowNodeRef>_WBvh0BA6EeiptuDNTChZDg</model:flowNodeRef>\n"
                + "      </model:lane>\n"
                + "    </model:laneSet>\n"
                + "    <model:serviceTask id=\"_MnzzcBA5EeiptuDNTChZDg\" name=\"Actividad de Servicio\">\n"
                + "      <model:documentation>Descripcion de servicio en proceso de negocio 2</model:documentation>\n"
                + "    </model:serviceTask>\n"
                + "    <model:startEvent id=\"_TZRgMBA5EeiptuDNTChZDg\" name=\"Inicio 2\">\n"
                + "      <model:documentation>Inicio del proceso de negocio 2</model:documentation>\n"
                + "    </model:startEvent>\n"
                + "    <model:scriptTask id=\"_aKR58BA5EeiptuDNTChZDg\" name=\"Actividad de script\">\n"
                + "      <model:documentation>Descripcion de actividad de script del proceso de negocio 2</model:documentation>\n"
                + "    </model:scriptTask>\n"
                + "    <model:parallelGateway id=\"_fsXpgBA5EeiptuDNTChZDg\" name=\"Compuerta paralela\">\n"
                + "      <model:documentation>Compuerta paralela del proceso de negocio 2</model:documentation>\n"
                + "    </model:parallelGateway>\n"
                + "    <model:task id=\"_pQiHYBA5EeiptuDNTChZDg\" name=\"Actividad paralela 1\"/>\n"
                + "    <model:task id=\"_pjgGsBA5EeiptuDNTChZDg\" name=\"Actividad paralela 2\"/>\n"
                + "    <model:exclusiveGateway id=\"_qlmc4BA5EeiptuDNTChZDg\" name=\"Compuerta XOR\" default=\"_zeDrUBA5EeiptuDNTChZDg\">\n"
                + "      <model:documentation>Descripcion compuerta XOR del proceso de negocio 2</model:documentation>\n"
                + "    </model:exclusiveGateway>\n"
                + "    <model:task id=\"_01cVABA5EeiptuDNTChZDg\" name=\"Actividad exlusiva 1\"/>\n"
                + "    <model:endEvent id=\"_U4go4BA6EeiptuDNTChZDg\" name=\"Fin 2\">\n"
                + "      <model:documentation>Fin del proceso de negocio 2</model:documentation>\n"
                + "    </model:endEvent>\n"
                + "    <model:task id=\"_WBvh0BA6EeiptuDNTChZDg\" name=\"Actividad exlusiva 2\"/>\n"
                + "    <model:sequenceFlow id=\"_VhzS8BA5EeiptuDNTChZDg\" name=\"\" sourceRef=\"_TZRgMBA5EeiptuDNTChZDg\" targetRef=\"_MnzzcBA5EeiptuDNTChZDg\"/>\n"
                + "    <model:sequenceFlow id=\"_Xu8f8BA5EeiptuDNTChZDg\" name=\"\" sourceRef=\"_MnzzcBA5EeiptuDNTChZDg\" targetRef=\"_aKR58BA5EeiptuDNTChZDg\"/>\n"
                + "    <model:sequenceFlow id=\"_fs1jkBA5EeiptuDNTChZDg\" name=\"\" sourceRef=\"_aKR58BA5EeiptuDNTChZDg\" targetRef=\"_fsXpgBA5EeiptuDNTChZDg\"/>\n"
                + "    <model:sequenceFlow id=\"_j2C0oBA5EeiptuDNTChZDg\" name=\"\" sourceRef=\"_fsXpgBA5EeiptuDNTChZDg\" targetRef=\"_pQiHYBA5EeiptuDNTChZDg\"/>\n"
                + "    <model:sequenceFlow id=\"_lreFMBA5EeiptuDNTChZDg\" name=\"\" sourceRef=\"_fsXpgBA5EeiptuDNTChZDg\" targetRef=\"_pjgGsBA5EeiptuDNTChZDg\"/>\n"
                + "    <model:sequenceFlow id=\"_soW-0BA5EeiptuDNTChZDg\" name=\"\" sourceRef=\"_pQiHYBA5EeiptuDNTChZDg\" targetRef=\"_qlmc4BA5EeiptuDNTChZDg\"/>\n"
                + "    <model:sequenceFlow id=\"_zeDrUBA5EeiptuDNTChZDg\" name=\"Decision 1\" sourceRef=\"_qlmc4BA5EeiptuDNTChZDg\" targetRef=\"_01cVABA5EeiptuDNTChZDg\"/>\n"
                + "    <model:sequenceFlow id=\"_1Vu-oBA5EeiptuDNTChZDg\" name=\"Decision 2\" sourceRef=\"_qlmc4BA5EeiptuDNTChZDg\" targetRef=\"_WBvh0BA6EeiptuDNTChZDg\">\n"
                + "      <model:conditionExpression xsi:type=\"model:tFormalExpression\" id=\"_ps-WUBA6EeiptuDNTChZDg\" evaluatesToTypeRef=\"java:java.lang.Boolean\" language=\"http://www.w3.org/1999/XPath\">true</model:conditionExpression>\n"
                + "    </model:sequenceFlow>\n"
                + "    <model:sequenceFlow id=\"_VXYWMBA6EeiptuDNTChZDg\" name=\"\" sourceRef=\"_01cVABA5EeiptuDNTChZDg\" targetRef=\"_U4go4BA6EeiptuDNTChZDg\"/>\n"
                + "    <model:sequenceFlow id=\"_Vsx-cBA6EeiptuDNTChZDg\" name=\"\" sourceRef=\"_WBvh0BA6EeiptuDNTChZDg\" targetRef=\"_U4go4BA6EeiptuDNTChZDg\"/>\n"
                + "    <model:sequenceFlow id=\"_W6ypsBA6EeiptuDNTChZDg\" name=\"\" sourceRef=\"_pjgGsBA5EeiptuDNTChZDg\" targetRef=\"_U4go4BA6EeiptuDNTChZDg\"/>\n"
                + "  </model:process>\n"
                + "  <di:BPMNDiagram name=\"MyDiagram\">\n"
                + "    <di:BPMNPlane id=\"plane__VglSIBAREeiptuDNTChZDg\" bpmnElement=\"_VglSIBAREeiptuDNTChZDg\">\n"
                + "      <di:BPMNShape id=\"_Vgl5QxAREeiptuDNTChZDg\" bpmnElement=\"_ps3ooBA6EeiptuDNTChZDg\" isHorizontal=\"true\">\n"
                + "        <dc:Bounds height=\"250.0\" width=\"1680.0\" x=\"0.0\" y=\"0.0\"/>\n"
                + "      </di:BPMNShape>\n"
                + "      <di:BPMNShape id=\"_Vgl5RhAREeiptuDNTChZDg\" bpmnElement=\"_VglSIhAREeiptuDNTChZDg\" isHorizontal=\"true\">\n"
                + "        <dc:Bounds height=\"250.0\" width=\"1650.0\" x=\"30.0\" y=\"0.0\"/>\n"
                + "      </di:BPMNShape>\n"
                + "      <di:BPMNShape id=\"_Vgl5TBAREeiptuDNTChZDg\" bpmnElement=\"_VglSIxAREeiptuDNTChZDg\">\n"
                + "        <dc:Bounds height=\"30.0\" width=\"30.0\" x=\"90.0\" y=\"68.0\"/>\n"
                + "        <di:BPMNLabel id=\"_ps4PsRA6EeiptuDNTChZDg\" labelStyle=\"_ps4PsBA6EeiptuDNTChZDg\">\n"
                + "          <dc:Bounds height=\"19.0\" width=\"35.0\" x=\"88.0\" y=\"103.0\"/>\n"
                + "        </di:BPMNLabel>\n"
                + "      </di:BPMNShape>\n"
                + "      <di:BPMNShape id=\"_YCDwYBAREeiptuDNTChZDg\" bpmnElement=\"_YBxcgBAREeiptuDNTChZDg\">\n"
                + "        <dc:Bounds height=\"30.0\" width=\"30.0\" x=\"700.0\" y=\"70.0\"/>\n"
                + "        <di:BPMNLabel id=\"_ps6r8BA6EeiptuDNTChZDg\" labelStyle=\"_ps4PsBA6EeiptuDNTChZDg\">\n"
                + "          <dc:Bounds height=\"19.0\" width=\"21.0\" x=\"705.0\" y=\"105.0\"/>\n"
                + "        </di:BPMNLabel>\n"
                + "      </di:BPMNShape>\n"
                + "      <di:BPMNShape id=\"_ay_m8BAREeiptuDNTChZDg\" bpmnElement=\"_ay-_4BAREeiptuDNTChZDg\">\n"
                + "        <dc:Bounds height=\"50.0\" width=\"100.0\" x=\"190.0\" y=\"60.0\"/>\n"
                + "      </di:BPMNShape>\n"
                + "      <di:BPMNShape id=\"_d1vmQBAREeiptuDNTChZDg\" bpmnElement=\"_d1txEBAREeiptuDNTChZDg\">\n"
                + "        <dc:Bounds height=\"50.0\" width=\"100.0\" x=\"396.0\" y=\"58.0\"/>\n"
                + "      </di:BPMNShape>\n"
                + "      <di:BPMNEdge id=\"_Vgl5WxAREeiptuDNTChZDg\" bpmnElement=\"_VglSQhAREeiptuDNTChZDg\">\n"
                + "        <di_1:waypoint x=\"120.0\" y=\"84.0\"/>\n"
                + "        <di_1:waypoint x=\"190.0\" y=\"84.0\"/>\n"
                + "        <di:BPMNLabel/>\n"
                + "      </di:BPMNEdge>\n"
                + "      <di:BPMNEdge id=\"_ckBfsBAREeiptuDNTChZDg\" bpmnElement=\"_ckA4oBAREeiptuDNTChZDg\">\n"
                + "        <di_1:waypoint x=\"290.0\" y=\"84.0\"/>\n"
                + "        <di_1:waypoint x=\"396.0\" y=\"84.0\"/>\n"
                + "        <di:BPMNLabel/>\n"
                + "      </di:BPMNEdge>\n"
                + "      <di:BPMNEdge id=\"_f3KrcBAREeiptuDNTChZDg\" bpmnElement=\"_f3IPMBAREeiptuDNTChZDg\">\n"
                + "        <di_1:waypoint x=\"496.0\" y=\"91.0\"/>\n"
                + "        <di_1:waypoint x=\"700.0\" y=\"91.0\"/>\n"
                + "        <di:BPMNLabel/>\n"
                + "      </di:BPMNEdge>\n"
                + "      <di:BPMNShape id=\"_DQ_1EBA5EeiptuDNTChZDg\" bpmnElement=\"_ps76EBA6EeiptuDNTChZDg\" isHorizontal=\"true\">\n"
                + "        <dc:Bounds height=\"250.0\" width=\"1680.0\" x=\"0.0\" y=\"300.0\"/>\n"
                + "      </di:BPMNShape>\n"
                + "      <di:BPMNShape id=\"_GCBLMBA5EeiptuDNTChZDg\" bpmnElement=\"_GCAkIBA5EeiptuDNTChZDg\" isHorizontal=\"true\">\n"
                + "        <dc:Bounds height=\"250.0\" width=\"1650.0\" x=\"30.0\" y=\"300.0\"/>\n"
                + "      </di:BPMNShape>\n"
                + "      <di:BPMNShape id=\"_Mn0ahBA5EeiptuDNTChZDg\" bpmnElement=\"_MnzzcBA5EeiptuDNTChZDg\">\n"
                + "        <dc:Bounds height=\"60.0\" width=\"120.0\" x=\"190.0\" y=\"400.0\"/>\n"
                + "      </di:BPMNShape>\n"
                + "      <di:BPMNShape id=\"_TZSuUBA5EeiptuDNTChZDg\" bpmnElement=\"_TZRgMBA5EeiptuDNTChZDg\">\n"
                + "        <dc:Bounds height=\"30.0\" width=\"30.0\" x=\"90.0\" y=\"410.0\"/>\n"
                + "        <di:BPMNLabel id=\"_ps9IMBA6EeiptuDNTChZDg\" labelStyle=\"_ps4PsBA6EeiptuDNTChZDg\">\n"
                + "          <dc:Bounds height=\"19.0\" width=\"46.0\" x=\"82.0\" y=\"445.0\"/>\n"
                + "        </di:BPMNLabel>\n"
                + "      </di:BPMNShape>\n"
                + "      <di:BPMNShape id=\"_aKTIFBA5EeiptuDNTChZDg\" bpmnElement=\"_aKR58BA5EeiptuDNTChZDg\">\n"
                + "        <dc:Bounds height=\"50.0\" width=\"100.0\" x=\"339.0\" y=\"400.0\"/>\n"
                + "      </di:BPMNShape>\n"
                + "      <di:BPMNShape id=\"_fsY3oBA5EeiptuDNTChZDg\" bpmnElement=\"_fsXpgBA5EeiptuDNTChZDg\">\n"
                + "        <dc:Bounds height=\"43.0\" width=\"43.0\" x=\"548.0\" y=\"410.0\"/>\n"
                + "        <di:BPMNLabel id=\"_ps9IMhA6EeiptuDNTChZDg\" labelStyle=\"_ps4PsBA6EeiptuDNTChZDg\">\n"
                + "          <dc:Bounds height=\"19.0\" width=\"131.0\" x=\"504.0\" y=\"458.0\"/>\n"
                + "        </di:BPMNLabel>\n"
                + "      </di:BPMNShape>\n"
                + "      <di:BPMNShape id=\"_pQiueRA5EeiptuDNTChZDg\" bpmnElement=\"_pQiHYBA5EeiptuDNTChZDg\">\n"
                + "        <dc:Bounds height=\"60.0\" width=\"120.0\" x=\"662.0\" y=\"323.0\"/>\n"
                + "      </di:BPMNShape>\n"
                + "      <di:BPMNShape id=\"_pjhU0BA5EeiptuDNTChZDg\" bpmnElement=\"_pjgGsBA5EeiptuDNTChZDg\">\n"
                + "        <dc:Bounds height=\"60.0\" width=\"120.0\" x=\"665.0\" y=\"418.0\"/>\n"
                + "      </di:BPMNShape>\n"
                + "      <di:BPMNShape id=\"_qlnrABA5EeiptuDNTChZDg\" bpmnElement=\"_qlmc4BA5EeiptuDNTChZDg\">\n"
                + "        <dc:Bounds height=\"43.0\" width=\"43.0\" x=\"868.0\" y=\"328.0\"/>\n"
                + "        <di:BPMNLabel id=\"_ps9INRA6EeiptuDNTChZDg\" labelStyle=\"_ps4PsBA6EeiptuDNTChZDg\">\n"
                + "          <dc:Bounds height=\"19.0\" width=\"109.0\" x=\"835.0\" y=\"376.0\"/>\n"
                + "        </di:BPMNLabel>\n"
                + "      </di:BPMNShape>\n"
                + "      <di:BPMNShape id=\"_01c8EhA5EeiptuDNTChZDg\" bpmnElement=\"_01cVABA5EeiptuDNTChZDg\">\n"
                + "        <dc:Bounds height=\"60.0\" width=\"120.0\" x=\"1042.0\" y=\"325.0\"/>\n"
                + "      </di:BPMNShape>\n"
                + "      <di:BPMNShape id=\"_U4ieEBA6EeiptuDNTChZDg\" bpmnElement=\"_U4go4BA6EeiptuDNTChZDg\">\n"
                + "        <dc:Bounds height=\"30.0\" width=\"30.0\" x=\"1390.0\" y=\"396.0\"/>\n"
                + "        <di:BPMNLabel id=\"_ps9vQRA6EeiptuDNTChZDg\" labelStyle=\"_ps4PsBA6EeiptuDNTChZDg\">\n"
                + "          <dc:Bounds height=\"19.0\" width=\"32.0\" x=\"1389.0\" y=\"431.0\"/>\n"
                + "        </di:BPMNLabel>\n"
                + "      </di:BPMNShape>\n"
                + "      <di:BPMNShape id=\"_WBwI5BA6EeiptuDNTChZDg\" bpmnElement=\"_WBvh0BA6EeiptuDNTChZDg\">\n"
                + "        <dc:Bounds height=\"60.0\" width=\"120.0\" x=\"1042.0\" y=\"407.0\"/>\n"
                + "      </di:BPMNShape>\n"
                + "      <di:BPMNEdge id=\"_Vh1IIBA5EeiptuDNTChZDg\" bpmnElement=\"_VhzS8BA5EeiptuDNTChZDg\">\n"
                + "        <di_1:waypoint x=\"120.0\" y=\"423.0\"/>\n"
                + "        <di_1:waypoint x=\"190.0\" y=\"423.0\"/>\n"
                + "        <di:BPMNLabel/>\n"
                + "      </di:BPMNEdge>\n"
                + "      <di:BPMNEdge id=\"_Xu9HABA5EeiptuDNTChZDg\" bpmnElement=\"_Xu8f8BA5EeiptuDNTChZDg\">\n"
                + "        <di_1:waypoint x=\"310.0\" y=\"427.0\"/>\n"
                + "        <di_1:waypoint x=\"339.0\" y=\"427.0\"/>\n"
                + "        <di:BPMNLabel/>\n"
                + "      </di:BPMNEdge>\n"
                + "      <di:BPMNEdge id=\"_fs2KoBA5EeiptuDNTChZDg\" bpmnElement=\"_fs1jkBA5EeiptuDNTChZDg\">\n"
                + "        <di_1:waypoint x=\"439.0\" y=\"428.0\"/>\n"
                + "        <di_1:waypoint x=\"548.0\" y=\"428.0\"/>\n"
                + "        <di:BPMNLabel/>\n"
                + "      </di:BPMNEdge>\n"
                + "      <di:BPMNEdge id=\"_j2C0oxA5EeiptuDNTChZDg\" bpmnElement=\"_j2C0oBA5EeiptuDNTChZDg\">\n"
                + "        <di_1:waypoint x=\"574.0\" y=\"410.0\"/>\n"
                + "        <di_1:waypoint x=\"574.0\" y=\"344.0\"/>\n"
                + "        <di_1:waypoint x=\"662.0\" y=\"344.0\"/>\n"
                + "        <di:BPMNLabel/>\n"
                + "      </di:BPMNEdge>\n"
                + "      <di:BPMNEdge id=\"_lresQhA5EeiptuDNTChZDg\" bpmnElement=\"_lreFMBA5EeiptuDNTChZDg\">\n"
                + "        <di_1:waypoint x=\"591.0\" y=\"439.0\"/>\n"
                + "        <di_1:waypoint x=\"665.0\" y=\"439.0\"/>\n"
                + "        <di:BPMNLabel/>\n"
                + "      </di:BPMNEdge>\n"
                + "      <di:BPMNEdge id=\"_soXl4BA5EeiptuDNTChZDg\" bpmnElement=\"_soW-0BA5EeiptuDNTChZDg\">\n"
                + "        <di_1:waypoint x=\"782.0\" y=\"349.0\"/>\n"
                + "        <di_1:waypoint x=\"868.0\" y=\"349.0\"/>\n"
                + "        <di:BPMNLabel/>\n"
                + "      </di:BPMNEdge>\n"
                + "      <di:BPMNEdge id=\"_zeESYhA5EeiptuDNTChZDg\" bpmnElement=\"_zeDrUBA5EeiptuDNTChZDg\">\n"
                + "        <di_1:waypoint x=\"911.0\" y=\"352.0\"/>\n"
                + "        <di_1:waypoint x=\"1042.0\" y=\"352.0\"/>\n"
                + "        <di:BPMNLabel/>\n"
                + "      </di:BPMNEdge>\n"
                + "      <di:BPMNEdge id=\"_1Vwz0BA5EeiptuDNTChZDg\" bpmnElement=\"_1Vu-oBA5EeiptuDNTChZDg\">\n"
                + "        <di_1:waypoint x=\"889.0\" y=\"371.0\"/>\n"
                + "        <di_1:waypoint x=\"889.0\" y=\"466.0\"/>\n"
                + "        <di_1:waypoint x=\"1042.0\" y=\"466.0\"/>\n"
                + "        <di:BPMNLabel/>\n"
                + "      </di:BPMNEdge>\n"
                + "      <di:BPMNEdge id=\"_VXY9QBA6EeiptuDNTChZDg\" bpmnElement=\"_VXYWMBA6EeiptuDNTChZDg\">\n"
                + "        <di_1:waypoint x=\"1162.0\" y=\"356.0\"/>\n"
                + "        <di_1:waypoint x=\"1396.0\" y=\"356.0\"/>\n"
                + "        <di_1:waypoint x=\"1396.0\" y=\"396.0\"/>\n"
                + "        <di:BPMNLabel/>\n"
                + "      </di:BPMNEdge>\n"
                + "      <di:BPMNEdge id=\"_VszMkBA6EeiptuDNTChZDg\" bpmnElement=\"_Vsx-cBA6EeiptuDNTChZDg\">\n"
                + "        <di_1:waypoint x=\"1162.0\" y=\"436.0\"/>\n"
                + "        <di_1:waypoint x=\"1230.0\" y=\"436.0\"/>\n"
                + "        <di_1:waypoint x=\"1230.0\" y=\"418.0\"/>\n"
                + "        <di_1:waypoint x=\"1390.0\" y=\"418.0\"/>\n"
                + "        <di:BPMNLabel/>\n"
                + "      </di:BPMNEdge>\n"
                + "      <di:BPMNEdge id=\"_W60e4BA6EeiptuDNTChZDg\" bpmnElement=\"_W6ypsBA6EeiptuDNTChZDg\">\n"
                + "        <di_1:waypoint x=\"685.0\" y=\"478.0\"/>\n"
                + "        <di_1:waypoint x=\"685.0\" y=\"492.0\"/>\n"
                + "        <di_1:waypoint x=\"1401.0\" y=\"492.0\"/>\n"
                + "        <di_1:waypoint x=\"1401.0\" y=\"426.0\"/>\n"
                + "        <di:BPMNLabel/>\n"
                + "      </di:BPMNEdge>\n"
                + "    </di:BPMNPlane>\n"
                + "    <di:BPMNLabelStyle id=\"_ps4PsBA6EeiptuDNTChZDg\">\n"
                + "      <dc:Font isBold=\"false\" isItalic=\"false\" isStrikeThrough=\"false\" isUnderline=\"false\" name=\"Cantarell\" size=\"9.0\"/>\n"
                + "    </di:BPMNLabelStyle>\n"
                + "  </di:BPMNDiagram>\n"
                + "</model:definitions>";
    }

}
