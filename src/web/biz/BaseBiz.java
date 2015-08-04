package web.biz;

import java.util.List;

import javax.annotation.Resource;

import web.dao.ICommonDao;

public class BaseBiz {
		
		protected ICommonDao dao;
		
//		@Autowired // �����������ID��ͬ�Զ�ע��
		@Resource(name="dao")
		public void setDao(ICommonDao dao) {
			this.dao = dao;
		}
		/**
		 * @˵�� ��ҳ�洫������listת�ɣ�1,2,3��������ʽ������ɾ��ʱʹ��
		 * @param list
		 * @return
		 */
		public String convertListToStr(List<Integer> list){
			//ƴ���ַ���
			StringBuffer sb = new StringBuffer("(");
			int i = 0;
			//�Ѵ��������ַ���idһ�����ӽ��ַ����У��Զ��ŷָ�
			for(Integer id : list){
				sb.append(id);
				if(i != list.size()-1) sb.append(",");
				i++;
			}
			sb.append(")");
			
			return sb.toString();
		}
		//sy���
		//�е���Long����
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
