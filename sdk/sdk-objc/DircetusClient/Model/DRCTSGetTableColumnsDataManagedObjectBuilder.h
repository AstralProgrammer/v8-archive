#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>


#import "DRCTSGetTableColumnsDataManagedObject.h"
#import "DRCTSGetTableColumnsData.h"

/**
* directus.io
* API for directus.io
*
* OpenAPI spec version: 1.1
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/


@interface DRCTSGetTableColumnsDataManagedObjectBuilder : NSObject



-(DRCTSGetTableColumnsDataManagedObject*)createNewDRCTSGetTableColumnsDataManagedObjectInContext:(NSManagedObjectContext*)context;

-(DRCTSGetTableColumnsDataManagedObject*)DRCTSGetTableColumnsDataManagedObjectFromDRCTSGetTableColumnsData:(DRCTSGetTableColumnsData*)object context:(NSManagedObjectContext*)context;

-(void)updateDRCTSGetTableColumnsDataManagedObject:(DRCTSGetTableColumnsDataManagedObject*)object withDRCTSGetTableColumnsData:(DRCTSGetTableColumnsData*)object2;

-(DRCTSGetTableColumnsData*)DRCTSGetTableColumnsDataFromDRCTSGetTableColumnsDataManagedObject:(DRCTSGetTableColumnsDataManagedObject*)obj;

-(void)updateDRCTSGetTableColumnsData:(DRCTSGetTableColumnsData*)object withDRCTSGetTableColumnsDataManagedObject:(DRCTSGetTableColumnsDataManagedObject*)object2;

@end
