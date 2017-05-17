/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.api;

import com.squareup.connect.ApiClient;
import com.squareup.connect.ApiException;
import com.squareup.connect.Configuration;
import com.squareup.connect.auth.OAuth;
import com.squareup.connect.models.BatchDeleteCatalogObjectsRequest;
import com.squareup.connect.models.BatchDeleteCatalogObjectsResponse;
import com.squareup.connect.models.BatchRetrieveCatalogObjectsRequest;
import com.squareup.connect.models.BatchRetrieveCatalogObjectsResponse;
import com.squareup.connect.models.BatchUpsertCatalogObjectsRequest;
import com.squareup.connect.models.BatchUpsertCatalogObjectsResponse;
import com.squareup.connect.models.CatalogCategory;
import com.squareup.connect.models.CatalogInfoResponse;
import com.squareup.connect.models.CatalogItem;
import com.squareup.connect.models.CatalogItemModifierListInfo;
import com.squareup.connect.models.CatalogItemVariation;
import com.squareup.connect.models.CatalogModifier;
import com.squareup.connect.models.CatalogModifierList;
import com.squareup.connect.models.CatalogObject;
import com.squareup.connect.models.CatalogObjectBatch;
import com.squareup.connect.models.CatalogTax;
import com.squareup.connect.models.DeleteCatalogObjectResponse;
import com.squareup.connect.models.ListCatalogResponse;
import com.squareup.connect.models.Money;
import com.squareup.connect.models.RetrieveCatalogObjectResponse;
import com.squareup.connect.models.SearchCatalogObjectsRequest;
import com.squareup.connect.models.SearchCatalogObjectsResponse;
import com.squareup.connect.models.UpdateItemModifierListsRequest;
import com.squareup.connect.models.UpdateItemModifierListsResponse;
import com.squareup.connect.models.UpdateItemTaxesRequest;
import com.squareup.connect.models.UpdateItemTaxesResponse;
import com.squareup.connect.models.UpsertCatalogObjectRequest;
import com.squareup.connect.models.UpsertCatalogObjectResponse;
import com.squareup.connect.utils.APITest;
import com.squareup.connect.utils.Account;

import io.swagger.annotations.Api;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.Assert.fail;

/**
 * API tests for CatalogApi
 */
//@Ignore
public class CatalogApiTest extends APITest {

    private final ApiClient defaultClient = Configuration.getDefaultApiClient();
    private final CatalogApi api = new CatalogApi();

    private static final CatalogObject beverages = new CatalogObject()
        .type(CatalogObject.TypeEnum.CATEGORY)
        .id("#Beverages")
        .categoryData(new CatalogCategory()
            .name("Beverages"));

    private static final CatalogObject milks = new CatalogObject()
        .type(CatalogObject.TypeEnum.MODIFIER_LIST)
        .id("#Milks")
        .modifierListData(new CatalogModifierList()
            .name("Milks")
            .modifiers(asList(new CatalogObject()
                    .type(CatalogObject.TypeEnum.MODIFIER)
                    .modifierData(new CatalogModifier()
                        .name("Whole Milk")),
                new CatalogObject()
                    .type(CatalogObject.TypeEnum.MODIFIER)
                    .modifierData(new CatalogModifier()
                        .name("Skim Milk")),
                new CatalogObject()
                    .type(CatalogObject.TypeEnum.MODIFIER)
                    .modifierData(new CatalogModifier()
                        .name("SoyMilk")
                        .priceMoney(new Money().amount(50L).currency(Money.CurrencyEnum.USD))))));

    private static final CatalogObject coffee = new CatalogObject()
        .type(CatalogObject.TypeEnum.ITEM)
        .id("#Coffee")
        .itemData(new CatalogItem()
            .name("Coffee")
            .description("Hot bean juice")
            .abbreviation("Co")
            .categoryId("#Beverages")
            .modifierListInfo(singletonList(new CatalogItemModifierListInfo().modifierListId("#Milks")))
            .taxIds(singletonList("#SalesTax"))
            .variations(asList(new CatalogObject()
                    .type(CatalogObject.TypeEnum.ITEM_VARIATION)
                    .id("#SmallCoffee")
                    .itemVariationData(new CatalogItemVariation()
                        .name("Small")
                        .itemId("#Coffee")
                        .pricingType(CatalogItemVariation.PricingTypeEnum.FIXED_PRICING)
                        .priceMoney(new Money().amount(195L).currency(Money.CurrencyEnum.USD))),
                new CatalogObject()
                    .type(CatalogObject.TypeEnum.ITEM_VARIATION)
                    .id("#LargeCoffee")
                    .itemVariationData(new CatalogItemVariation()
                        .name("Large")
                        .itemId("#Coffee")
                        .pricingType(CatalogItemVariation.PricingTypeEnum.FIXED_PRICING)
                        .priceMoney(new Money().amount(250L).currency(Money.CurrencyEnum.USD)))))
        );

    private static final CatalogObject tea = new CatalogObject()
        .type(CatalogObject.TypeEnum.ITEM)
        .id("#Tea")
        .itemData(new CatalogItem()
            .name("Tea")
            .description("Hot leaf juice")
            .abbreviation("Te")
            .categoryId("#Beverages")
            .modifierListInfo(singletonList(new CatalogItemModifierListInfo().modifierListId("#Milks")))
            .taxIds(singletonList("#SalesTax"))
            .variations(asList(new CatalogObject()
                    .type(CatalogObject.TypeEnum.ITEM_VARIATION)
                    .id("#SmallTea")
                    .itemVariationData(new CatalogItemVariation()
                        .name("Small")
                        .itemId("#Tea")
                        .pricingType(CatalogItemVariation.PricingTypeEnum.FIXED_PRICING)
                        .priceMoney(new Money().amount(150L).currency(Money.CurrencyEnum.USD))),
                new CatalogObject()
                    .type(CatalogObject.TypeEnum.ITEM_VARIATION)
                    .id("#LargeTea")
                    .itemVariationData(new CatalogItemVariation()
                        .name("Large")
                        .itemId("#Tea")
                        .pricingType(CatalogItemVariation.PricingTypeEnum.FIXED_PRICING)
                        .priceMoney(new Money().amount(200L).currency(Money.CurrencyEnum.USD)))))
        );

    private static final CatalogObject salesTax = new CatalogObject()
        .type(CatalogObject.TypeEnum.TAX)
        .id("#SalesTax")
        .taxData(new CatalogTax()
            .name("SalesTax"));

    @Before
    public void setup() {
        Account sandboxAccount = accounts.get("US-Prod-Sandbox");
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken(sandboxAccount.accessToken);

        try {
            buildTestCatalog();
        } catch (ApiException e) {
            fail(e.getMessage());
        }
    }

    @After
    public void tearDown() {
        try {
            deleteTestCatalog();
        } catch (ApiException e) {
            fail(e.getMessage());
        }
    }

    private void buildTestCatalog() throws ApiException {
        BatchUpsertCatalogObjectsResponse response = api.batchUpsertCatalogObjects(new BatchUpsertCatalogObjectsRequest()
            .idempotencyKey(UUID.randomUUID().toString())
            .batches(singletonList(new CatalogObjectBatch().objects(asList(beverages, milks, coffee, tea, salesTax)))));
        if (!response.getErrors().isEmpty()) {
            throw new ApiException(response.getErrors().toString());
        }
    }

    private void deleteTestCatalog() throws ApiException {
        String cursor = "";
        List<String> objectsToDelete = new ArrayList<>();

        while (true) {
            ListCatalogResponse response = api.listCatalog(cursor, null);
            for (CatalogObject object : response.getObjects()) {
                objectsToDelete.add(object.getId());
            }

            cursor = response.getCursor();
            if (cursor == null || cursor.isEmpty()) {
                break;
            }
        }

        BatchDeleteCatalogObjectsResponse response =
            api.batchDeleteCatalogObjects(new BatchDeleteCatalogObjectsRequest()
                .objectIds(objectsToDelete));
        if (!response.getErrors().isEmpty()) {
            throw new ApiException(response.getErrors().toString());
        }
    }

    /**
     * BatchDeleteCatalogObjects
     * <p>
     * Deletes a set of [CatalogItem](#type-catalogitem)s based on the provided list of target IDs and returns a set of successfully deleted IDs in the response. Deletion is a cascading event such that all children of the targeted object are also deleted. For example, deleting a CatalogItem will also delete all of its [CatalogItemVariation](#type-catalogitemvariation) children.  &#x60;BatchDeleteCatalogObjects&#x60; succeeds even if only a portion of the targeted IDs can be deleted. The response will only include IDs that were actually deleted.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void batchDeleteCatalogObjectsTest() throws ApiException {
        BatchDeleteCatalogObjectsRequest body = null;
        BatchDeleteCatalogObjectsResponse response = api.batchDeleteCatalogObjects(body);

        Assert.assertEquals(2 + 2, 5);
        // TODO: test validations
    }

    /**
     * BatchRetrieveCatalogObjects
     * <p>
     * Returns a set of objects based on the provided ID. [CatalogItem](#type-catalogitem)s returned in the set include all of the child information including: all [CatalogItemVariation](#type-catalogitemvariation) objects, references to its [CatalogModifierList](#type-catalogmodifierlist) objects, and the ids of any [CatalogTax](#type-catalogtax) objects that apply to it.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void batchRetrieveCatalogObjectsTest() throws ApiException {
        BatchRetrieveCatalogObjectsRequest body = null;
        BatchRetrieveCatalogObjectsResponse response = api.batchRetrieveCatalogObjects(body);

        // TODO: test validations
    }

    /**
     * BatchUpsertCatalogObjects
     * <p>
     * Creates or updates up to 10,000 target objects based on the provided list of objects. The target objects are grouped into batches and each batch is inserted/updated in an all-or-nothing manner. If an object within a batch is malformed in some way, or violates a database constraint, the entire batch containing that item will be disregarded. However, other batches in the same request may still succeed. Each batch may contain up to 1,000 objects, and batches will be processed in order as long as the total object count for the request (items, variations, modifier lists, discounts, and taxes) is no more than 10,000.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void batchUpsertCatalogObjectsTest() throws ApiException {
        BatchUpsertCatalogObjectsRequest body = null;
        BatchUpsertCatalogObjectsResponse response = api.batchUpsertCatalogObjects(body);

        // TODO: test validations
    }

    /**
     * CatalogInfo
     * <p>
     * Returns information about the Square Catalog API, such as batch size limits for &#x60;BatchUpsertCatalogObjects&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void catalogInfoTest() throws ApiException {
        CatalogInfoResponse response = api.catalogInfo();

        // TODO: test validations
    }

    /**
     * DeleteCatalogObject
     * <p>
     * Deletes a single [CatalogObject](#type-catalogobject) based on the provided ID and returns the set of successfully deleted IDs in the response. Deletion is a cascading event such that all children of the targeted object are also deleted. For example, deleting a [CatalogItem](#type-catalogitem) will also delete all of its [CatalogItemVariation](#type-catalogitemvariation) children.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCatalogObjectTest() throws ApiException {
        String objectId = null;
        DeleteCatalogObjectResponse response = api.deleteCatalogObject(objectId);

        // TODO: test validations
    }

    /**
     * ListCatalog
     * <p>
     * Returns a list of [CatalogObject](#type-catalogobject)s that includes all objects of a set of desired types (for example, all [CatalogItem](#type-catalogitem) and [CatalogTax](#type-catalogtax) objects) in the catalog. The types parameter is specified as a comma-separated list of valid [CatalogObject](#type-catalogobject) types: &#x60;ITEM&#x60;, &#x60;ITEM_VARIATION&#x60;, &#x60;MODIFIER&#x60;, &#x60;MODIFIER_LIST&#x60;, &#x60;CATEGORY&#x60;, &#x60;DISCOUNT&#x60;, &#x60;TAX&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCatalogTest() throws ApiException {
        String cursor = null;
        String types = null;
        ListCatalogResponse response = api.listCatalog(cursor, types);

        // TODO: test validations
    }

    /**
     * RetrieveCatalogObject
     * <p>
     * Returns a single [CatalogItem](#type-catalogitem) as a [CatalogObject](#type-catalogobject) based on the provided ID. The returned object includes all of the relevant [CatalogItem](#type-catalogitem) information including: [CatalogItemVariation](#type-catalogitemvariation) children, references to its [CatalogModifierList](#type-catalogmodifierlist) objects, and the ids of any [CatalogTax](#type-catalogtax) objects that apply to it.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveCatalogObjectTest() throws ApiException {
        String objectId = null;
        Boolean includeRelatedObjects = null;
        RetrieveCatalogObjectResponse response = api.retrieveCatalogObject(objectId, includeRelatedObjects);

        // TODO: test validations
    }

    /**
     * SearchCatalogObjects
     * <p>
     * Queries the targeted catalog using a variety of query types ([CatalogQuerySortedAttribute](#type-catalogquerysortedattribute), ([CatalogQueryExact](#type-catalogqueryexact, ([CatalogQueryRange](#type-catalogqueryrange), ([CatalogQueryText](#type-catalogquerytext), ([CatalogQueryItemsForTax](#type-catalogqueryitemsfortax), ([CatalogQueryItemsForModifierList](#type-catalogqueryitemsformodifierlist)).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCatalogObjectsTest() throws ApiException {
        SearchCatalogObjectsRequest body = null;
        SearchCatalogObjectsResponse response = api.searchCatalogObjects(body);

        // TODO: test validations
    }

    /**
     * UpdateItemModifierLists
     * <p>
     * Updates the [CatalogModifierList](#type-catalogmodifierlist) objects that apply to the targeted [CatalogItem](#type-catalogitem) without having to perform an upsert on the entire item.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateItemModifierListsTest() throws ApiException {
        UpdateItemModifierListsRequest body = null;
        UpdateItemModifierListsResponse response = api.updateItemModifierLists(body);

        // TODO: test validations
    }

    /**
     * UpdateItemTaxes
     * <p>
     * Updates the [CatalogTax](#type-catalogtax) objects that apply to the targeted [CatalogItem](#type-catalogitem) without having to perform an upsert on the entire item.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateItemTaxesTest() throws ApiException {
        UpdateItemTaxesRequest body = null;
        UpdateItemTaxesResponse response = api.updateItemTaxes(body);

        // TODO: test validations
    }

    /**
     * UpsertCatalogObject
     * <p>
     * Creates or updates the target [CatalogObject](#type-catalogobject).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void upsertCatalogObjectTest() throws ApiException {
        UpsertCatalogObjectRequest body = null;
        UpsertCatalogObjectResponse response = api.upsertCatalogObject(body);

        // TODO: test validations
    }
}
