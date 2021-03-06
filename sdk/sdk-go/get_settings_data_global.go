/* 
 * directus.io
 *
 * API for directus.io
 *
 * OpenAPI spec version: 1.1
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package directussdk

type GetSettingsDataGlobal struct {

	CmsUserAutoSignOut string `json:"cms_user_auto_sign_out,omitempty"`

	ProjectName string `json:"project_name,omitempty"`

	ProjectUrl string `json:"project_url,omitempty"`

	CmsColor string `json:"cms_color,omitempty"`

	RowsPerPage string `json:"rows_per_page,omitempty"`

	CmsThumbnailUrl string `json:"cms_thumbnail_url,omitempty"`
}
