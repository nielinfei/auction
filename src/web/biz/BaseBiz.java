package web.biz;

import java.util.List;

import javax.annotation.Resource;

import web.dao.ICommonDao;

public class BaseBiz {
		
		protected ICommonDao dao;
		
//		@Autowired // 属性名与类的ID相同自动注入
		@Resource(name="dao")
		public void setDao(ICommonDao dao) {
			this.dao = dao;
		}
		/**
		 * @说明 把页面传过来的list转成（1,2,3）这种形式，批量删除时使用
		 * @param list
		 * @return
		 */
		public String convertListToStr(List<Integer> list){
			//拼接字符串
			StringBuffer sb = new StringBuffer("(");
			int i = 0;
			//把传进来的字符串id一个个加进字符串中，以逗号分隔
			for(Integer id : list){
				sb.append(id);
				if(i != list.size()-1) sb.append(",");
				i++;
			}
			sb.append(")");
			
			return sb.toString();
		}
		//sy添加
		//有的是Long类型
		public String convertListToStrL(List<Long> list){
			StringBuffer sb = new StringBuffer("(");
			int i = 0;
			for(Long id : list){
				sb.append(id);
				if(i != list.size()-1) sb.append(",");
				i++;
			}
			sb.append(")");
			
			return sb.toString();
		}

	}
