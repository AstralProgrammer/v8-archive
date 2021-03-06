

#import "DRCTSGetSettingsForMetaManagedObjectBuilder.h"

/**
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen
* Do not edit the class manually.
*/

@implementation DRCTSGetSettingsForMetaManagedObjectBuilder

-(instancetype)init {
    self = [super init];
    if (self != nil) {
    }
    return self;
}

-(DRCTSGetSettingsForMetaManagedObject*)createNewDRCTSGetSettingsForMetaManagedObjectInContext:(NSManagedObjectContext*)context {
    DRCTSGetSettingsForMetaManagedObject *managedObject = [NSEntityDescription insertNewObjectForEntityForName:NSStringFromClass([DRCTSGetSettingsForMetaManagedObject class]) inManagedObjectContext:context];
    return managedObject;
}

-(DRCTSGetSettingsForMetaManagedObject*)DRCTSGetSettingsForMetaManagedObjectFromDRCTSGetSettingsForMeta:(DRCTSGetSettingsForMeta*)object context:(NSManagedObjectContext*)context {
    DRCTSGetSettingsForMetaManagedObject* newDRCTSGetSettingsForMeta = [self createNewDRCTSGetSettingsForMetaManagedObjectInContext:context];
    [self updateDRCTSGetSettingsForMetaManagedObject:newDRCTSGetSettingsForMeta withDRCTSGetSettingsForMeta:object];
    return newDRCTSGetSettingsForMeta;
}

-(void)updateDRCTSGetSettingsForMetaManagedObject:(DRCTSGetSettingsForMetaManagedObject*)managedObject withDRCTSGetSettingsForMeta:(DRCTSGetSettingsForMeta*)object {
    if(!managedObject || !object) {
        return;
    }
    NSManagedObjectContext* context = managedObject.managedObjectContext;
    managedObject.type = [object.type copy];
    managedObject.table = [object.table copy];
    managedObject.settingsCollection = [object.settingsCollection copy];

}

-(DRCTSGetSettingsForMeta*)DRCTSGetSettingsForMetaFromDRCTSGetSettingsForMetaManagedObject:(DRCTSGetSettingsForMetaManagedObject*)obj {
    if(!obj) {
        return nil;
    }
    DRCTSGetSettingsForMeta* newDRCTSGetSettingsForMeta = [[DRCTSGetSettingsForMeta alloc] init];
    [self updateDRCTSGetSettingsForMeta:newDRCTSGetSettingsForMeta withDRCTSGetSettingsForMetaManagedObject:obj];
    return newDRCTSGetSettingsForMeta;
}

-(void)updateDRCTSGetSettingsForMeta:(DRCTSGetSettingsForMeta*)newDRCTSGetSettingsForMeta withDRCTSGetSettingsForMetaManagedObject:(DRCTSGetSettingsForMetaManagedObject*)obj {
    newDRCTSGetSettingsForMeta.type = [obj.type copy];
    newDRCTSGetSettingsForMeta.table = [obj.table copy];
    newDRCTSGetSettingsForMeta.settingsCollection = [obj.settingsCollection copy];
}

@end
