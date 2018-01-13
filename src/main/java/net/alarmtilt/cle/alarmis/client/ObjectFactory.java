
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.alarmtilt.cle.alarmis.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RequestSubscriptionResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "requestSubscriptionResponse");
    private final static QName _ImportAgenda_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "importAgenda");
    private final static QName _ListContactAttribute_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "listContactAttribute");
    private final static QName _ListManagementUnitResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "listManagementUnitResponse");
    private final static QName _ListContact_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "listContact");
    private final static QName _ListSubscription_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "listSubscription");
    private final static QName _ListContactUser_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "listContactUser");
    private final static QName _PingServiceResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "pingServiceResponse");
    private final static QName _ListCmcInstanceResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "listCmcInstanceResponse");
    private final static QName _ListContactUserResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "listContactUserResponse");
    private final static QName _ImportAgendaResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "importAgendaResponse");
    private final static QName _LaunchProcedure_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "launchProcedure");
    private final static QName _SendNotificationResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "sendNotificationResponse");
    private final static QName _CreateContactUser_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "createContactUser");
    private final static QName _ListContactResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "listContactResponse");
    private final static QName _CreateContactUserResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "createContactUserResponse");
    private final static QName _DeleteContactUser_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "deleteContactUser");
    private final static QName _LaunchCmcResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "launchCmcResponse");
    private final static QName _ListCmcDefinition_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "listCmcDefinition");
    private final static QName _ListManagementUnit_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "listManagementUnit");
    private final static QName _ExportAgendaResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "exportAgendaResponse");
    private final static QName _ListCmcInstance_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "listCmcInstance");
    private final static QName _ListSubscriptionResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "listSubscriptionResponse");
    private final static QName _GetContactUserResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "getContactUserResponse");
    private final static QName _ValidateSubscriptionResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "validateSubscriptionResponse");
    private final static QName _ValidateSubscription_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "validateSubscription");
    private final static QName _GetContactUser_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "getContactUser");
    private final static QName _ExportAgenda_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "exportAgenda");
    private final static QName _SendNotification_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "sendNotification");
    private final static QName _UpdateContactUserResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "updateContactUserResponse");
    private final static QName _RequestSubscription_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "requestSubscription");
    private final static QName _PingService_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "pingService");
    private final static QName _ListCmcDefinitionResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "listCmcDefinitionResponse");
    private final static QName _UpdateContactUser_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "updateContactUser");
    private final static QName _ListContactAttributeResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "listContactAttributeResponse");
    private final static QName _DeleteContactUserResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "deleteContactUserResponse");
    private final static QName _LaunchProcedureResponse_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "launchProcedureResponse");
    private final static QName _LaunchCmc_QNAME = new QName("com.alarmtilt.webservice.soap.res.v3", "launchCmc");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.alarmtilt.cle.alarmis.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteContactUser }
     * 
     */
    public DeleteContactUser createDeleteContactUser() {
        return new DeleteContactUser();
    }

    /**
     * Create an instance of {@link CreateContactUser }
     * 
     */
    public CreateContactUser createCreateContactUser() {
        return new CreateContactUser();
    }

    /**
     * Create an instance of {@link ListContactUser }
     * 
     */
    public ListContactUser createListContactUser() {
        return new ListContactUser();
    }

    /**
     * Create an instance of {@link ListCmcDefinition }
     * 
     */
    public ListCmcDefinition createListCmcDefinition() {
        return new ListCmcDefinition();
    }

    /**
     * Create an instance of {@link CmcDefinitionFilter }
     * 
     */
    public CmcDefinitionFilter createCmcDefinitionFilter() {
        return new CmcDefinitionFilter();
    }

    /**
     * Create an instance of {@link ValidateSubscriptionResponse }
     * 
     */
    public ValidateSubscriptionResponse createValidateSubscriptionResponse() {
        return new ValidateSubscriptionResponse();
    }

    /**
     * Create an instance of {@link PingServiceResult }
     * 
     */
    public PingServiceResult createPingServiceResult() {
        return new PingServiceResult();
    }

    /**
     * Create an instance of {@link Notification }
     * 
     */
    public Notification createNotification() {
        return new Notification();
    }

    /**
     * Create an instance of {@link ContactUser }
     * 
     */
    public ContactUser createContactUser() {
        return new ContactUser();
    }

    /**
     * Create an instance of {@link DeleteContactUserResponse }
     * 
     */
    public DeleteContactUserResponse createDeleteContactUserResponse() {
        return new DeleteContactUserResponse();
    }

    /**
     * Create an instance of {@link LaunchCmc }
     * 
     */
    public LaunchCmc createLaunchCmc() {
        return new LaunchCmc();
    }

    /**
     * Create an instance of {@link ValidateSubscription }
     * 
     */
    public ValidateSubscription createValidateSubscription() {
        return new ValidateSubscription();
    }

    /**
     * Create an instance of {@link ListManagementUnitResult }
     * 
     */
    public ListManagementUnitResult createListManagementUnitResult() {
        return new ListManagementUnitResult();
    }

    /**
     * Create an instance of {@link ContactUserAttributeVariableValue }
     * 
     */
    public ContactUserAttributeVariableValue createContactUserAttributeVariableValue() {
        return new ContactUserAttributeVariableValue();
    }

    /**
     * Create an instance of {@link GetContactUser }
     * 
     */
    public GetContactUser createGetContactUser() {
        return new GetContactUser();
    }

    /**
     * Create an instance of {@link ListSubscriptionParam }
     * 
     */
    public ListSubscriptionParam createListSubscriptionParam() {
        return new ListSubscriptionParam();
    }

    /**
     * Create an instance of {@link ListContactAttributeResult }
     * 
     */
    public ListContactAttributeResult createListContactAttributeResult() {
        return new ListContactAttributeResult();
    }

    /**
     * Create an instance of {@link ManagementUnit }
     * 
     */
    public ManagementUnit createManagementUnit() {
        return new ManagementUnit();
    }

    /**
     * Create an instance of {@link ListContactUserParam }
     * 
     */
    public ListContactUserParam createListContactUserParam() {
        return new ListContactUserParam();
    }

    /**
     * Create an instance of {@link ListManagementUnitResponse }
     * 
     */
    public ListManagementUnitResponse createListManagementUnitResponse() {
        return new ListManagementUnitResponse();
    }

    /**
     * Create an instance of {@link AuthParam }
     * 
     */
    public AuthParam createAuthParam() {
        return new AuthParam();
    }

    /**
     * Create an instance of {@link ImportAgendaParam }
     * 
     */
    public ImportAgendaParam createImportAgendaParam() {
        return new ImportAgendaParam();
    }

    /**
     * Create an instance of {@link SendNotification }
     * 
     */
    public SendNotification createSendNotification() {
        return new SendNotification();
    }

    /**
     * Create an instance of {@link GetContactUserParam }
     * 
     */
    public GetContactUserParam createGetContactUserParam() {
        return new GetContactUserParam();
    }

    /**
     * Create an instance of {@link ListCmcInstanceParam }
     * 
     */
    public ListCmcInstanceParam createListCmcInstanceParam() {
        return new ListCmcInstanceParam();
    }

    /**
     * Create an instance of {@link GetContactUserResponse }
     * 
     */
    public GetContactUserResponse createGetContactUserResponse() {
        return new GetContactUserResponse();
    }

    /**
     * Create an instance of {@link ContactResponse }
     * 
     */
    public ContactResponse createContactResponse() {
        return new ContactResponse();
    }

    /**
     * Create an instance of {@link DeleteContactUserResultInfo }
     * 
     */
    public DeleteContactUserResultInfo createDeleteContactUserResultInfo() {
        return new DeleteContactUserResultInfo();
    }

    /**
     * Create an instance of {@link DeleteContactUserParam }
     * 
     */
    public DeleteContactUserParam createDeleteContactUserParam() {
        return new DeleteContactUserParam();
    }

    /**
     * Create an instance of {@link ListManagementUnitParam }
     * 
     */
    public ListManagementUnitParam createListManagementUnitParam() {
        return new ListManagementUnitParam();
    }

    /**
     * Create an instance of {@link UpdateContactUserResult }
     * 
     */
    public UpdateContactUserResult createUpdateContactUserResult() {
        return new UpdateContactUserResult();
    }

    /**
     * Create an instance of {@link UpdateContactUser }
     * 
     */
    public UpdateContactUser createUpdateContactUser() {
        return new UpdateContactUser();
    }

    /**
     * Create an instance of {@link PingService }
     * 
     */
    public PingService createPingService() {
        return new PingService();
    }

    /**
     * Create an instance of {@link ContactAttributeVariable }
     * 
     */
    public ContactAttributeVariable createContactAttributeVariable() {
        return new ContactAttributeVariable();
    }

    /**
     * Create an instance of {@link ImportAgendaResponse }
     * 
     */
    public ImportAgendaResponse createImportAgendaResponse() {
        return new ImportAgendaResponse();
    }

    /**
     * Create an instance of {@link ContactUserAddress }
     * 
     */
    public ContactUserAddress createContactUserAddress() {
        return new ContactUserAddress();
    }

    /**
     * Create an instance of {@link ListContactResponse }
     * 
     */
    public ListContactResponse createListContactResponse() {
        return new ListContactResponse();
    }

    /**
     * Create an instance of {@link ListContactAttributeResponse }
     * 
     */
    public ListContactAttributeResponse createListContactAttributeResponse() {
        return new ListContactAttributeResponse();
    }

    /**
     * Create an instance of {@link CreateContactUserResponse }
     * 
     */
    public CreateContactUserResponse createCreateContactUserResponse() {
        return new CreateContactUserResponse();
    }

    /**
     * Create an instance of {@link LaunchProcedureParam }
     * 
     */
    public LaunchProcedureParam createLaunchProcedureParam() {
        return new LaunchProcedureParam();
    }

    /**
     * Create an instance of {@link ListSubscriptionFilter }
     * 
     */
    public ListSubscriptionFilter createListSubscriptionFilter() {
        return new ListSubscriptionFilter();
    }

    /**
     * Create an instance of {@link LaunchProcedure }
     * 
     */
    public LaunchProcedure createLaunchProcedure() {
        return new LaunchProcedure();
    }

    /**
     * Create an instance of {@link ContactUserAttribute }
     * 
     */
    public ContactUserAttribute createContactUserAttribute() {
        return new ContactUserAttribute();
    }

    /**
     * Create an instance of {@link ListSubscriptionResponse }
     * 
     */
    public ListSubscriptionResponse createListSubscriptionResponse() {
        return new ListSubscriptionResponse();
    }

    /**
     * Create an instance of {@link RequestSubscriptionResponse }
     * 
     */
    public RequestSubscriptionResponse createRequestSubscriptionResponse() {
        return new RequestSubscriptionResponse();
    }

    /**
     * Create an instance of {@link ListContactAttribute }
     * 
     */
    public ListContactAttribute createListContactAttribute() {
        return new ListContactAttribute();
    }

    /**
     * Create an instance of {@link LaunchProcedureResultInfo }
     * 
     */
    public LaunchProcedureResultInfo createLaunchProcedureResultInfo() {
        return new LaunchProcedureResultInfo();
    }

    /**
     * Create an instance of {@link CreateContactUserParam }
     * 
     */
    public CreateContactUserParam createCreateContactUserParam() {
        return new CreateContactUserParam();
    }

    /**
     * Create an instance of {@link CmcInstance }
     * 
     */
    public CmcInstance createCmcInstance() {
        return new CmcInstance();
    }

    /**
     * Create an instance of {@link ListContactFilter }
     * 
     */
    public ListContactFilter createListContactFilter() {
        return new ListContactFilter();
    }

    /**
     * Create an instance of {@link SendNotificationParam }
     * 
     */
    public SendNotificationParam createSendNotificationParam() {
        return new SendNotificationParam();
    }

    /**
     * Create an instance of {@link LaunchProcedureInstance }
     * 
     */
    public LaunchProcedureInstance createLaunchProcedureInstance() {
        return new LaunchProcedureInstance();
    }

    /**
     * Create an instance of {@link ListContactAttributeParam }
     * 
     */
    public ListContactAttributeParam createListContactAttributeParam() {
        return new ListContactAttributeParam();
    }

    /**
     * Create an instance of {@link ExportAgendaResult }
     * 
     */
    public ExportAgendaResult createExportAgendaResult() {
        return new ExportAgendaResult();
    }

    /**
     * Create an instance of {@link LaunchCmcParam }
     * 
     */
    public LaunchCmcParam createLaunchCmcParam() {
        return new LaunchCmcParam();
    }

    /**
     * Create an instance of {@link CmcDefinition }
     * 
     */
    public CmcDefinition createCmcDefinition() {
        return new CmcDefinition();
    }

    /**
     * Create an instance of {@link ListSubscriptionResult }
     * 
     */
    public ListSubscriptionResult createListSubscriptionResult() {
        return new ListSubscriptionResult();
    }

    /**
     * Create an instance of {@link LaunchCmcResult }
     * 
     */
    public LaunchCmcResult createLaunchCmcResult() {
        return new LaunchCmcResult();
    }

    /**
     * Create an instance of {@link ExportAgenda }
     * 
     */
    public ExportAgenda createExportAgenda() {
        return new ExportAgenda();
    }

    /**
     * Create an instance of {@link ContactDynamicSelection }
     * 
     */
    public ContactDynamicSelection createContactDynamicSelection() {
        return new ContactDynamicSelection();
    }

    /**
     * Create an instance of {@link ImportAgenda }
     * 
     */
    public ImportAgenda createImportAgenda() {
        return new ImportAgenda();
    }

    /**
     * Create an instance of {@link ExportAgendaParam }
     * 
     */
    public ExportAgendaParam createExportAgendaParam() {
        return new ExportAgendaParam();
    }

    /**
     * Create an instance of {@link ListCmcInstanceResult }
     * 
     */
    public ListCmcInstanceResult createListCmcInstanceResult() {
        return new ListCmcInstanceResult();
    }

    /**
     * Create an instance of {@link AttributeVariableValue }
     * 
     */
    public AttributeVariableValue createAttributeVariableValue() {
        return new AttributeVariableValue();
    }

    /**
     * Create an instance of {@link UpdateContactUserParam }
     * 
     */
    public UpdateContactUserParam createUpdateContactUserParam() {
        return new UpdateContactUserParam();
    }

    /**
     * Create an instance of {@link ContactDynamicSelectionCondition }
     * 
     */
    public ContactDynamicSelectionCondition createContactDynamicSelectionCondition() {
        return new ContactDynamicSelectionCondition();
    }

    /**
     * Create an instance of {@link LaunchCmcResponse }
     * 
     */
    public LaunchCmcResponse createLaunchCmcResponse() {
        return new LaunchCmcResponse();
    }

    /**
     * Create an instance of {@link ListContact }
     * 
     */
    public ListContact createListContact() {
        return new ListContact();
    }

    /**
     * Create an instance of {@link SendNotificationResponse }
     * 
     */
    public SendNotificationResponse createSendNotificationResponse() {
        return new SendNotificationResponse();
    }

    /**
     * Create an instance of {@link SendNotificationResult }
     * 
     */
    public SendNotificationResult createSendNotificationResult() {
        return new SendNotificationResult();
    }

    /**
     * Create an instance of {@link ListContactUserResponse }
     * 
     */
    public ListContactUserResponse createListContactUserResponse() {
        return new ListContactUserResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ListCmcDefinitionResponse }
     * 
     */
    public ListCmcDefinitionResponse createListCmcDefinitionResponse() {
        return new ListCmcDefinitionResponse();
    }

    /**
     * Create an instance of {@link PingServiceResponse }
     * 
     */
    public PingServiceResponse createPingServiceResponse() {
        return new PingServiceResponse();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link Step }
     * 
     */
    public Step createStep() {
        return new Step();
    }

    /**
     * Create an instance of {@link ImportAgendaResult }
     * 
     */
    public ImportAgendaResult createImportAgendaResult() {
        return new ImportAgendaResult();
    }

    /**
     * Create an instance of {@link ExportAgendaResponse }
     * 
     */
    public ExportAgendaResponse createExportAgendaResponse() {
        return new ExportAgendaResponse();
    }

    /**
     * Create an instance of {@link ContactUserMedia }
     * 
     */
    public ContactUserMedia createContactUserMedia() {
        return new ContactUserMedia();
    }

    /**
     * Create an instance of {@link LaunchProcedureResponse }
     * 
     */
    public LaunchProcedureResponse createLaunchProcedureResponse() {
        return new LaunchProcedureResponse();
    }

    /**
     * Create an instance of {@link ListSubscription }
     * 
     */
    public ListSubscription createListSubscription() {
        return new ListSubscription();
    }

    /**
     * Create an instance of {@link GetContactUserResult }
     * 
     */
    public GetContactUserResult createGetContactUserResult() {
        return new GetContactUserResult();
    }

    /**
     * Create an instance of {@link ListContactParam }
     * 
     */
    public ListContactParam createListContactParam() {
        return new ListContactParam();
    }

    /**
     * Create an instance of {@link ListManagementUnit }
     * 
     */
    public ListManagementUnit createListManagementUnit() {
        return new ListManagementUnit();
    }

    /**
     * Create an instance of {@link ListCmcDefinitionParam }
     * 
     */
    public ListCmcDefinitionParam createListCmcDefinitionParam() {
        return new ListCmcDefinitionParam();
    }

    /**
     * Create an instance of {@link RequestSubscriptionParam }
     * 
     */
    public RequestSubscriptionParam createRequestSubscriptionParam() {
        return new RequestSubscriptionParam();
    }

    /**
     * Create an instance of {@link ListCmcInstanceResponse }
     * 
     */
    public ListCmcInstanceResponse createListCmcInstanceResponse() {
        return new ListCmcInstanceResponse();
    }

    /**
     * Create an instance of {@link Subscription }
     * 
     */
    public Subscription createSubscription() {
        return new Subscription();
    }

    /**
     * Create an instance of {@link CreateContactUserResult }
     * 
     */
    public CreateContactUserResult createCreateContactUserResult() {
        return new CreateContactUserResult();
    }

    /**
     * Create an instance of {@link DeleteContactUserResult }
     * 
     */
    public DeleteContactUserResult createDeleteContactUserResult() {
        return new DeleteContactUserResult();
    }

    /**
     * Create an instance of {@link Reply }
     * 
     */
    public Reply createReply() {
        return new Reply();
    }

    /**
     * Create an instance of {@link ValidateSubscriptionResult }
     * 
     */
    public ValidateSubscriptionResult createValidateSubscriptionResult() {
        return new ValidateSubscriptionResult();
    }

    /**
     * Create an instance of {@link StepContact }
     * 
     */
    public StepContact createStepContact() {
        return new StepContact();
    }

    /**
     * Create an instance of {@link CmcInstanceFilter }
     * 
     */
    public CmcInstanceFilter createCmcInstanceFilter() {
        return new CmcInstanceFilter();
    }

    /**
     * Create an instance of {@link ListContactUserResult }
     * 
     */
    public ListContactUserResult createListContactUserResult() {
        return new ListContactUserResult();
    }

    /**
     * Create an instance of {@link ListContactResult }
     * 
     */
    public ListContactResult createListContactResult() {
        return new ListContactResult();
    }

    /**
     * Create an instance of {@link ListCmcInstance }
     * 
     */
    public ListCmcInstance createListCmcInstance() {
        return new ListCmcInstance();
    }

    /**
     * Create an instance of {@link ContactAttributeValue }
     * 
     */
    public ContactAttributeValue createContactAttributeValue() {
        return new ContactAttributeValue();
    }

    /**
     * Create an instance of {@link WsAttachment }
     * 
     */
    public WsAttachment createWsAttachment() {
        return new WsAttachment();
    }

    /**
     * Create an instance of {@link ContactUserAddressPostal }
     * 
     */
    public ContactUserAddressPostal createContactUserAddressPostal() {
        return new ContactUserAddressPostal();
    }

    /**
     * Create an instance of {@link RequestSubscription }
     * 
     */
    public RequestSubscription createRequestSubscription() {
        return new RequestSubscription();
    }

    /**
     * Create an instance of {@link LaunchProcedureResult }
     * 
     */
    public LaunchProcedureResult createLaunchProcedureResult() {
        return new LaunchProcedureResult();
    }

    /**
     * Create an instance of {@link ValidateSubscriptionParam }
     * 
     */
    public ValidateSubscriptionParam createValidateSubscriptionParam() {
        return new ValidateSubscriptionParam();
    }

    /**
     * Create an instance of {@link RequestSubscriptionResult }
     * 
     */
    public RequestSubscriptionResult createRequestSubscriptionResult() {
        return new RequestSubscriptionResult();
    }

    /**
     * Create an instance of {@link UpdateContactUserResponse }
     * 
     */
    public UpdateContactUserResponse createUpdateContactUserResponse() {
        return new UpdateContactUserResponse();
    }

    /**
     * Create an instance of {@link ProcedureVariable }
     * 
     */
    public ProcedureVariable createProcedureVariable() {
        return new ProcedureVariable();
    }

    /**
     * Create an instance of {@link ListCmcDefinitionResult }
     * 
     */
    public ListCmcDefinitionResult createListCmcDefinitionResult() {
        return new ListCmcDefinitionResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestSubscriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "requestSubscriptionResponse")
    public JAXBElement<RequestSubscriptionResponse> createRequestSubscriptionResponse(RequestSubscriptionResponse value) {
        return new JAXBElement<RequestSubscriptionResponse>(_RequestSubscriptionResponse_QNAME, RequestSubscriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportAgenda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "importAgenda")
    public JAXBElement<ImportAgenda> createImportAgenda(ImportAgenda value) {
        return new JAXBElement<ImportAgenda>(_ImportAgenda_QNAME, ImportAgenda.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListContactAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "listContactAttribute")
    public JAXBElement<ListContactAttribute> createListContactAttribute(ListContactAttribute value) {
        return new JAXBElement<ListContactAttribute>(_ListContactAttribute_QNAME, ListContactAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListManagementUnitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "listManagementUnitResponse")
    public JAXBElement<ListManagementUnitResponse> createListManagementUnitResponse(ListManagementUnitResponse value) {
        return new JAXBElement<ListManagementUnitResponse>(_ListManagementUnitResponse_QNAME, ListManagementUnitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "listContact")
    public JAXBElement<ListContact> createListContact(ListContact value) {
        return new JAXBElement<ListContact>(_ListContact_QNAME, ListContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSubscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "listSubscription")
    public JAXBElement<ListSubscription> createListSubscription(ListSubscription value) {
        return new JAXBElement<ListSubscription>(_ListSubscription_QNAME, ListSubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListContactUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "listContactUser")
    public JAXBElement<ListContactUser> createListContactUser(ListContactUser value) {
        return new JAXBElement<ListContactUser>(_ListContactUser_QNAME, ListContactUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "pingServiceResponse")
    public JAXBElement<PingServiceResponse> createPingServiceResponse(PingServiceResponse value) {
        return new JAXBElement<PingServiceResponse>(_PingServiceResponse_QNAME, PingServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCmcInstanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "listCmcInstanceResponse")
    public JAXBElement<ListCmcInstanceResponse> createListCmcInstanceResponse(ListCmcInstanceResponse value) {
        return new JAXBElement<ListCmcInstanceResponse>(_ListCmcInstanceResponse_QNAME, ListCmcInstanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListContactUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "listContactUserResponse")
    public JAXBElement<ListContactUserResponse> createListContactUserResponse(ListContactUserResponse value) {
        return new JAXBElement<ListContactUserResponse>(_ListContactUserResponse_QNAME, ListContactUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportAgendaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "importAgendaResponse")
    public JAXBElement<ImportAgendaResponse> createImportAgendaResponse(ImportAgendaResponse value) {
        return new JAXBElement<ImportAgendaResponse>(_ImportAgendaResponse_QNAME, ImportAgendaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LaunchProcedure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "launchProcedure")
    public JAXBElement<LaunchProcedure> createLaunchProcedure(LaunchProcedure value) {
        return new JAXBElement<LaunchProcedure>(_LaunchProcedure_QNAME, LaunchProcedure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "sendNotificationResponse")
    public JAXBElement<SendNotificationResponse> createSendNotificationResponse(SendNotificationResponse value) {
        return new JAXBElement<SendNotificationResponse>(_SendNotificationResponse_QNAME, SendNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateContactUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "createContactUser")
    public JAXBElement<CreateContactUser> createCreateContactUser(CreateContactUser value) {
        return new JAXBElement<CreateContactUser>(_CreateContactUser_QNAME, CreateContactUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "listContactResponse")
    public JAXBElement<ListContactResponse> createListContactResponse(ListContactResponse value) {
        return new JAXBElement<ListContactResponse>(_ListContactResponse_QNAME, ListContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateContactUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "createContactUserResponse")
    public JAXBElement<CreateContactUserResponse> createCreateContactUserResponse(CreateContactUserResponse value) {
        return new JAXBElement<CreateContactUserResponse>(_CreateContactUserResponse_QNAME, CreateContactUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContactUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "deleteContactUser")
    public JAXBElement<DeleteContactUser> createDeleteContactUser(DeleteContactUser value) {
        return new JAXBElement<DeleteContactUser>(_DeleteContactUser_QNAME, DeleteContactUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LaunchCmcResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "launchCmcResponse")
    public JAXBElement<LaunchCmcResponse> createLaunchCmcResponse(LaunchCmcResponse value) {
        return new JAXBElement<LaunchCmcResponse>(_LaunchCmcResponse_QNAME, LaunchCmcResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCmcDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "listCmcDefinition")
    public JAXBElement<ListCmcDefinition> createListCmcDefinition(ListCmcDefinition value) {
        return new JAXBElement<ListCmcDefinition>(_ListCmcDefinition_QNAME, ListCmcDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListManagementUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "listManagementUnit")
    public JAXBElement<ListManagementUnit> createListManagementUnit(ListManagementUnit value) {
        return new JAXBElement<ListManagementUnit>(_ListManagementUnit_QNAME, ListManagementUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportAgendaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "exportAgendaResponse")
    public JAXBElement<ExportAgendaResponse> createExportAgendaResponse(ExportAgendaResponse value) {
        return new JAXBElement<ExportAgendaResponse>(_ExportAgendaResponse_QNAME, ExportAgendaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCmcInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "listCmcInstance")
    public JAXBElement<ListCmcInstance> createListCmcInstance(ListCmcInstance value) {
        return new JAXBElement<ListCmcInstance>(_ListCmcInstance_QNAME, ListCmcInstance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSubscriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "listSubscriptionResponse")
    public JAXBElement<ListSubscriptionResponse> createListSubscriptionResponse(ListSubscriptionResponse value) {
        return new JAXBElement<ListSubscriptionResponse>(_ListSubscriptionResponse_QNAME, ListSubscriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "getContactUserResponse")
    public JAXBElement<GetContactUserResponse> createGetContactUserResponse(GetContactUserResponse value) {
        return new JAXBElement<GetContactUserResponse>(_GetContactUserResponse_QNAME, GetContactUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateSubscriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "validateSubscriptionResponse")
    public JAXBElement<ValidateSubscriptionResponse> createValidateSubscriptionResponse(ValidateSubscriptionResponse value) {
        return new JAXBElement<ValidateSubscriptionResponse>(_ValidateSubscriptionResponse_QNAME, ValidateSubscriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateSubscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "validateSubscription")
    public JAXBElement<ValidateSubscription> createValidateSubscription(ValidateSubscription value) {
        return new JAXBElement<ValidateSubscription>(_ValidateSubscription_QNAME, ValidateSubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "getContactUser")
    public JAXBElement<GetContactUser> createGetContactUser(GetContactUser value) {
        return new JAXBElement<GetContactUser>(_GetContactUser_QNAME, GetContactUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportAgenda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "exportAgenda")
    public JAXBElement<ExportAgenda> createExportAgenda(ExportAgenda value) {
        return new JAXBElement<ExportAgenda>(_ExportAgenda_QNAME, ExportAgenda.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "sendNotification")
    public JAXBElement<SendNotification> createSendNotification(SendNotification value) {
        return new JAXBElement<SendNotification>(_SendNotification_QNAME, SendNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContactUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "updateContactUserResponse")
    public JAXBElement<UpdateContactUserResponse> createUpdateContactUserResponse(UpdateContactUserResponse value) {
        return new JAXBElement<UpdateContactUserResponse>(_UpdateContactUserResponse_QNAME, UpdateContactUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestSubscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "requestSubscription")
    public JAXBElement<RequestSubscription> createRequestSubscription(RequestSubscription value) {
        return new JAXBElement<RequestSubscription>(_RequestSubscription_QNAME, RequestSubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "pingService")
    public JAXBElement<PingService> createPingService(PingService value) {
        return new JAXBElement<PingService>(_PingService_QNAME, PingService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCmcDefinitionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "listCmcDefinitionResponse")
    public JAXBElement<ListCmcDefinitionResponse> createListCmcDefinitionResponse(ListCmcDefinitionResponse value) {
        return new JAXBElement<ListCmcDefinitionResponse>(_ListCmcDefinitionResponse_QNAME, ListCmcDefinitionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContactUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "updateContactUser")
    public JAXBElement<UpdateContactUser> createUpdateContactUser(UpdateContactUser value) {
        return new JAXBElement<UpdateContactUser>(_UpdateContactUser_QNAME, UpdateContactUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListContactAttributeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "listContactAttributeResponse")
    public JAXBElement<ListContactAttributeResponse> createListContactAttributeResponse(ListContactAttributeResponse value) {
        return new JAXBElement<ListContactAttributeResponse>(_ListContactAttributeResponse_QNAME, ListContactAttributeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContactUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "deleteContactUserResponse")
    public JAXBElement<DeleteContactUserResponse> createDeleteContactUserResponse(DeleteContactUserResponse value) {
        return new JAXBElement<DeleteContactUserResponse>(_DeleteContactUserResponse_QNAME, DeleteContactUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LaunchProcedureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "launchProcedureResponse")
    public JAXBElement<LaunchProcedureResponse> createLaunchProcedureResponse(LaunchProcedureResponse value) {
        return new JAXBElement<LaunchProcedureResponse>(_LaunchProcedureResponse_QNAME, LaunchProcedureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LaunchCmc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.alarmtilt.webservice.soap.res.v3", name = "launchCmc")
    public JAXBElement<LaunchCmc> createLaunchCmc(LaunchCmc value) {
        return new JAXBElement<LaunchCmc>(_LaunchCmc_QNAME, LaunchCmc.class, null, value);
    }

}
